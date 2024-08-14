package com.interview.questions;

/*Given three lists of integers.
Example Inputs:
List 1: [1,2,3,4,5]
List 2: [2,3,4]
List 3: [1,2,3]
* Find the common numbers across all three lists. O/P: [2,3]
* Find the numbers that are distinct (not common) across all three lists.  O/P : [1,4,5]
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Galaxy {

    public List<Integer> commonNumber(List<Integer> list1, List<Integer> list2, List<Integer> list3){

        List<Integer> list = list1.stream().filter(l1 -> l1.equals(list2.stream().filter( l2 -> l2.equals(list3.stream())))).
                collect(Collectors.toList());

        return list;
    }

    public List<Integer> notCommonNumber(List<Integer> list1, List<Integer> list2, List<Integer> list3){
        List<Integer> list = list1.stream().filter(l1 -> !l1.equals(list2.stream().filter( l2 -> !l2.equals( list3.stream().filter(l3 -> !l3.equals(l1)))))).
                collect(Collectors.toList());

        return list;
    }

    public static void main(String... args){
        Galaxy t1 = new Galaxy();
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(2, 3, 4);
        List<Integer> list3 = List.of(1, 2, 3);

        // Find common numbers
        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(list2);
        common.retainAll(list3);
        System.out.println("Common numbers: " + common);

        // Find distinct numbers
        Set<Integer> distinct = new HashSet<>(list1);
        distinct.addAll(list2);
        distinct.addAll(list3);
        distinct.removeAll(common);
        System.out.println("Distinct numbers: " + distinct);
    }
}

