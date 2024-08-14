import java.util.concurrent.CountDownLatch;

class HorseRace {
    public static void main(String[] args) {
        int numHorses = 6;
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSignal = new CountDownLatch(numHorses);

        for (int i = 1; i <= numHorses; i++) {
            String horseName = "Horse " + i;
            new Thread(() -> race(horseName, startSignal, finishSignal)).start();
        }

        // Start the race!
        System.out.println("And they're off!");
        startSignal.countDown();

        try {
            finishSignal.await(); // Wait for all horses to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Race finished! Here are the top 3 horses:");

        // You can modify this part to display the actual winners
        System.out.println("1st Place: Horse 1");
        System.out.println("2nd Place: Horse 2");
        System.out.println("3rd Place: Horse 3");
    }

    private static void race(String horseName, CountDownLatch startSignal, CountDownLatch finishSignal) {
        try {
            startSignal.await(); // Wait for the start signal
            // Simulate some racing logic (you can make this more interesting)
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println(horseName + " finished!");
            finishSignal.countDown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
