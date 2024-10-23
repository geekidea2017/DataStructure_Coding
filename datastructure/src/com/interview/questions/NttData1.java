package com.interview.questions;

import org.w3c.dom.Node;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/* Given an array of size n that has the following specifications:
         Each element in the array contains either a policeman or a thief.
         Each policeman can catch only one thief.
         A policeman cannot catch a thief who is more than K units away from the policeman.


         Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
         k = 1.Output : 2.
         Here maximum 2 thieves can be caught, first
         policeman catches first thief and second police-
         man can catch either second or third thief.
         Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'},
         k = 2.Output : 3.
         Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
         k = 3.
         Output : 3.*/


public class NttData1 {

    public static void main(String[] args) {

       //reverse linkedlist
/*

        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;
        int arrLength = arr.length;

        if(arrLength == 0){
            System.out.println("no Data to check");
        }

        for(int i=0; i< arrLength; i++){

            if (arr[i] == 'P'){

            }

        }

*/




    //    A:1, B:2,C:3

        String s1 = "A:1,B:2,C:3";

        Map<String, String> map = Arrays.stream(s1.split(","))
                .map(entry -> entry.split(":"))
                .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
        System.out.println(map);






    }
}



