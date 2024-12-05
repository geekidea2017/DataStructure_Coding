package com.leetcode75.solutions.easy.array_String;

public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println("before : a good   example" );
        System.out.println("After : "+ reverseWords.reverseWords("a good   example")); // example good a"
    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] splitValues = s.split("\\s");
        int left = 0;
        int right = splitValues.length-1;
        while(left < right){
                String temp = splitValues[left].trim();
                splitValues[left] = splitValues[right].trim();
                splitValues[right] = temp;
                left ++;
                right --;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< splitValues.length; i++){
            if(!splitValues[i].equals("")){
                sb.append(splitValues[i]).append(" ");
            }

        }
        return sb.toString().trim();
    }
}
