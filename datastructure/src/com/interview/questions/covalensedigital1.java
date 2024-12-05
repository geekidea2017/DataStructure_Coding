package com.interview.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
/* Given Map<Integer, String> fruits = new HashMap<>();
fruits.put(1,"Apple");
fruits.put(2,"Pinapple");
fruits.put(3,"Grapes");
fruits.put(4,"Cherry");
fruits.put(5,"Apple");
fruits.put(6,"Orange");
fruits.put(7,"Watermelon");
fruits.put(8,"Watermelon");

sort the above map based value and remove duplicate elements.

the expected output = {[1,"Apple"],[4,"Cherry"],[3,"Grapes],[6,"Orange"],[2,"Pinapple"],[7,"Watermelon"]}; */
public class covalensedigital1 {
    public static void main(String[] args)
    {
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1,"Apple");
        fruits.put(2,"Pinapple");
        fruits.put(3,"Grapes");
        fruits.put(4,"Cherry");
        fruits.put(5,"Apple");
        fruits.put(6,"Orange");
        fruits.put(7,"Watermelon");
        fruits.put(8,"Watermelon");

        Map<Integer, String> resultfruits = new HashMap<>();
        fruits.entrySet().stream().filter(e -> !resultfruits.containsValue(e.getValue())).forEach(entry -> resultfruits.put(entry.getKey(),entry.getValue()));
        System.out.println("Non Duplicate map : "+ resultfruits);
        Map<Integer, String> s  = resultfruits.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new ));

        System.out.println(s);
    }
}
