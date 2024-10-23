package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capco {

    public static void main(String[] args){
        //Input: I am am at a *a place called# capco capco.
        //output: I am at a place called capco.

        String input = "I am am at a *a place called# capco capco.";

       String replaceInput =  input.replaceAll("[*#.//s]","");
        String[] splitInput = replaceInput.split(" ");

        List<String> joinedInput = Arrays.stream(splitInput).distinct().collect(Collectors.toList());

       String output =  joinedInput.stream().collect(Collectors.joining(" "));

        System.out.println(output.concat("."));
    }
}
