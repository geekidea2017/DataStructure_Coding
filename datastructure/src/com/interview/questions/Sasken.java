package com.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sasken {

    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5};
        int n=5;

        int len = arr.length;

        Set<Integer> setValue = new HashSet<Integer>();

        for(int i=0 ; i< len-1 && i < n;i++){
            System.out.print("values are : "+ arr[i] );
            int temp = n-arr[i];
            if(Arrays.asList(arr).contains(temp) && setValue.add(temp) &&  setValue.add(arr[i])){

                System.out.println("values are : "+ arr[i] + " & "+ temp);
            }

        }
    }
}
