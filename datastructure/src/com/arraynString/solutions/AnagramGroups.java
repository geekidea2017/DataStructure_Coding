package com.arraynString.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String s = "eat tea tan ate nat bat";
        String[] strs = s.split(" ");
        //strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        Map<Integer,List<String>> maxAnagramList = new HashMap<Integer,List<String>>();
        int previossize = 0 ;

        for (List<String> group : result) {
            int size = group.size();
            if(size > previossize){
                previossize = size;
            }
            maxAnagramList.put(size,group);

            System.out.println(group);
        }
        System.out.println("------------------------------------");
        System.out.println(maxAnagramList.get(previossize));
    }
}

