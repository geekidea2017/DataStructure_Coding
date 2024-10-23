package com.interview.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Delloit {

// 1-> name1,2->name2, 3->name1, 4->name4

    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"name1");
        map.put(2,"name2");
        map.put(3,"name1");
        map.put(4,"name4");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        Set<String> seenValues = new HashSet<>();
      /*  while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            if(!seenValues.add(entry.getValue())){
                iterator.remove();
            }
        }
        System.out.println(map);*/

        Map<Integer, String> ma = map.entrySet().stream().distinct().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(ma);
    }
}
