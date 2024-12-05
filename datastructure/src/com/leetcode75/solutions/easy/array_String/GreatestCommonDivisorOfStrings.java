package com.leetcode75.solutions.easy.array_String;
/*
* 1071. Greatest Common Divisor of Strings
*
* For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
* */

import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings3(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int a = str1.length();
        int b = str2.length();
        int c = a-b;
        return str1.substring(0,c);
    }

    public static String gcdOfStrings2(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return str2.substring(0, a);
    }


    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if(str2.equals(str1)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return  gcdOfStrings(str1.substring(str2.length()),str2);
        }
        return "";


    }
    public static void main(String[] args){
        String str1 = "LEET";
        String str2 = "CODE";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings2(str1,str2));
        System.out.println(gcdOfStrings3(str1,str2));

        System.out.println("----------------------------------------------------------");

        str1 = "ABABABAB";
        str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings2(str1,str2));
        System.out.println(gcdOfStrings3(str1,str2));

        System.out.println("----------------------------------------------------------");


        str1 = "ABCABC";
        str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings2(str1,str2));
        System.out.println(gcdOfStrings3(str1,str2));

        System.out.println("----------------------------------------------------------");

        str1 = "ABCDEF";
        str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings2(str1,str2));
        System.out.println(gcdOfStrings3(str1,str2));

        System.out.println("----------------------------------------------------------");

        str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings2(str1,str2));
        System.out.println(gcdOfStrings3(str1,str2));
    }
}
