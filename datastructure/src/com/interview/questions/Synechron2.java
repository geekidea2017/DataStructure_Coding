package com.interview.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Synechron2 {
    public static void main(String[] args)
    {
        String s = "This is a Java Developer Interview";
        //siht si
        String removedSpace1 = s.replaceAll("\\s","");
        removedSpace1 = removedSpace1.toLowerCase();

        Map<Character, Long> output = removedSpace1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(output);


        String[] removedSpace = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
       for(int i=0; i< removedSpace.length ; i++){
           StringBuilder sb = new StringBuilder(removedSpace[i]);
           reversedString.append(sb.reverse() + " ");

       }
        System.out.println(reversedString);
        String ss = Arrays.stream(removedSpace)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(" "));
        System.out.println(ss);
    }


}
