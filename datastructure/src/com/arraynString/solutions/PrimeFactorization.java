package com.arraynString.solutions;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        int number = 12;  // You can change this number to test
        List<Integer> factors = primeFactors(number);
        System.out.println("Prime factors of " + number + ": " + factors);
    }
}

