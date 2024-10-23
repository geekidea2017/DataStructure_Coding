package com.interview.questions;

/*

Merge two unsorted arrays into sorted array without duplicates [2,4,5,6,3], [2,4,5,6,3,6,7,8,2]

*/

import java.util.*;
import java.util.stream.IntStream;

public class Epam2 {

    public static void main(String[] args){
        int[] ar1 = {2,4,5,6,3};
        int[] ar2 = {2,4,5,6,3,6,7,8,2};

        //List<Integer> list1 = Arrays.

        int[] setValue = IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2)).distinct().sorted().toArray();

        for(int value : setValue){
            System.out.println(value);
        }


    }
}
