package com.leetcode75.solutions.easy.array_String;


public class ReverseVowelInString {
    public static void main(String[] args) {
        ReverseVowelInString reverseVowelInString = new ReverseVowelInString();
        System.out.println("before : IceCreAm" );
        System.out.println("After : "+ reverseVowelInString.reverseVowels("IceCreAm")); // AceCreIm
    }

    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (chars[left] == 'a' || chars[left] == 'e' || chars[left] == 'i' || chars[left] == 'o' || chars[left] == 'u' ||
                    chars[left] == 'A' || chars[left] == 'E' || chars[left] == 'I' || chars[left] == 'O' || chars[left] == 'U') {

                if (chars[right] == 'a' || chars[right] == 'e' || chars[right] == 'i' || chars[right] == 'o' || chars[right] == 'u' ||
                        chars[right] == 'A' || chars[right] == 'E' || chars[right] == 'I' || chars[right] == 'O' || chars[right] == 'U') {

                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;

                } else {
                    right--;
                }
            } else {
                left++;
            }

        }
        return new String(chars);
    }
}

