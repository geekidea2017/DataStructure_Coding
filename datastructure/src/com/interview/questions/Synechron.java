package com.interview.questions;

import java.util.Arrays;

public class Synechron {

/*    Mother In Law and Hitler Woman are anagrams
    keEp and peeK are anagrams
    Toss and Shot are not anagrams
    joy and enjoy are not anagrams*/

    static void isAnagram(String s1, String s2)
    {

        String s1Replace = s1.replaceAll("\\s", "");
        String s2Replace = s2.replaceAll("\\s", "");

        char[] s1Char = s1Replace.toLowerCase().toCharArray();
        char[] s2Char = s2Replace.toLowerCase().toCharArray();

        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        boolean value = false;
        if(s1Char.length != s2Char.length){
            System.out.println("Not anagrams");
        }else{
            for(int i=0; i< s1Char.length; i++){

                if(s1Char[i]!=s2Char[i]){
                    value = true;
                    break;
                }
            }
           if(value){
               System.out.println(" Not anagrams");
           }else{
               System.out.println("anagrams");
           }

        }
    }
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");
    }
}
