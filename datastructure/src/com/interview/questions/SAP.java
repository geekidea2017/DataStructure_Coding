package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class SAP {
    public static void main(String[] args) {
        String str = "GOD";
        int n = str.length();
        System.out.println("All possible combinations of the string \""
                + str + "\":");
      //  combinations("", str);

        //Without recursion
        List<String> combinations = new ArrayList<>();

        // Generate all combinations
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                combinations.add(str.substring(i, j));
            }
        }

        // Print all combinations
        System.out.println("Combinations of the string 'GOD': " + combinations);

    }

    private static void combinations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(prefix + " --- " +  str.charAt(i) + " --- " + str.substring(0, i));
                combinations(prefix + str.charAt(i), str.substring(0, i) +
                        str.substring(i + 1, n));
            }
        }
    }
}
