import java.util.HashMap;
import java.util.Map;

public class MostFrequentInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20,20, 30, 30, 40, 40, 40, 40, 50, 50, 50,20 };

        int mostFrequentElement = findMostFrequent(arr);
        System.out.println("Most frequent element: " + mostFrequentElement);
    }

    private static int findMostFrequent(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int maxFrequency = 0;
        int mostFrequentElement = -1;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
    }
}
