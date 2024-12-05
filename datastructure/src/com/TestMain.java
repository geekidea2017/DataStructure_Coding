package com;

public class TestMain {
    public static void main(String[] args) {
        MyInterface instance = () -> System.out.println("Implementing method a");

        // Call the abstract method a()
        instance.a();

        // Call the default method b()
        instance.b();

        // The private static method c() cannot be called from the outside, only within the interface
        // MyInterface.c(); // This would not work

        // To demonstrate the usage of d(), we’ll just have another abstract method
       // instance.d();
    }
}
