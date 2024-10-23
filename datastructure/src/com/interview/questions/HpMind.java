package com.interview.questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HpMind {

    public static void main(String... args){

      //  String "aaaabbca" -> {a=5, b=2, c=1} using java 8

        String input = "aaaabbca";

        System.out.println(input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        System.out.println("Hello");
    }
}
