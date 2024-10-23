package com.interview.questions;


public class Alimetrics {

    public static void main(String... args){
        Integer[] intValues = {2,5,7,1,9,-20,10,23,-4,0,200};
        //output - 10
        int temp =0;
        for(int i=0, j=i+1; i<= intValues.length-1; i++){
            if(j <= intValues.length-1){
                if(intValues[i] > intValues[j]){
                    temp = intValues[j];
                    intValues[j] = intValues[i];
                    intValues[i] = temp;
                }
                System.out.print(" " + intValues[i] + " ");
                System.out.println();
                j++;
            }


        }
        for(int i=0; i< intValues.length; i++){
            System.out.print(" " + intValues[i] + " ");
        }

        //sorted Array
        System.out.println(intValues[intValues.length-2]);
    }
}
