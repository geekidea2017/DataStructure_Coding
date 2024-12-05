package com;

@FunctionalInterface
public interface MyInterface {
    void a();  // Abstract method

    default void b() {
        System.out.println("Default method b");
    }

    private static void c() {
        System.out.println("Private static method c");
    }

   // void d();  // Abstract method
}
