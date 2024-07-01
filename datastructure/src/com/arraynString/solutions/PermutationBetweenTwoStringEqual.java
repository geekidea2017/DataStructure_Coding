package com.arraynString.solutions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PermutationBetweenTwoStringEqual {

    public boolean compareTwoString(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        s1 =  s1.toLowerCase();
        s2 = s2.toLowerCase();
        return arraySortingString(s1).equals(arraySortingString(s2));

    }
    public static String arraySortingString(String s){
        return s.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());

    }
    public static void main(String[] args){
        PermutationBetweenTwoStringEqual permutationBetweenTwoStringEqual = new PermutationBetweenTwoStringEqual();
        if(permutationBetweenTwoStringEqual.compareTwoString("god","dog")){
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }

        if(permutationBetweenTwoStringEqual.compareTwoString("GOD","DOG")){
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }

        if(permutationBetweenTwoStringEqual.compareTwoString("aaaas","aaar")){
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }
    }
}
