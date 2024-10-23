package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Info {

    public static void main(String... args){
        //Input - aabbbccaaa
        //Output - a2b3c2a3

        String input = "aabbbccaaa";
        String output = "";
        String firstChar = "";
        int count = 1;
     //   Map<String,Integer> map = new HashMap<>();
       for(int i=1; i<input.length(); i++){

        if(input.charAt(i) == input.charAt(i-1)){
            count++;
        }else{
            output = output+input.charAt(i-1) + count;
            count = 1;
        }

        }
        output = output+input.charAt(input.length()-1) + count;
System.out.println(output);
    }
}
