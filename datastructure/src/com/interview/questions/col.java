package com.interview.questions;

public class col {

    public static void main(String[] args){
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);   // -> ?           (true/false) - flase
        System.out.println(str1.equals(str2)); // -> ?(true/false) -  True

    }



    final class FinalClass {}

    final void finalMethod() {}

    final int FINAL_VARIABLE = 10;
}


class ThreadExample {
    public static void main(String[] args) {
        //record Person(String name, int age) {}
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}



  /*      try {
// code
        } catch (Exception e) {
// handle exception
        } finally {
// cleanup code
        }*/