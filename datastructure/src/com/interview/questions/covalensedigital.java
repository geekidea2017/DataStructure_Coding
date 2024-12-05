package com.interview.questions;

import java.util.Stack;

public class covalensedigital {

    public static void main(String[] args)
    {

        //Identify consecutive occurrences of the same character and replace the occurrence with the character itself and the number of times it is repeated.
        //Ex Input: AAAbbAaMMoooPPPwwww
        //Ex Output: A3b2AaM2o3P3w4
        String input = "AAAbbAaMMoooPPPwwww";
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< input.length(); i++){



            if(!stack.empty() && stack.peek() == input.charAt(i)){

                stack.push(input.charAt(i));

            }else if(!stack.empty() && stack.peek() != input.charAt(i)){

                int count = 0;
                sb.append(stack.peek());
                while(!stack.empty()){
                         stack.pop();
                       count++;

                   }
                if(count > 1){
                    sb.append(count);
                }

                stack.push(input.charAt(i));
            }else{
                stack.push(input.charAt(i));
            }

        }
        if(!stack.empty()){

            int count = 0;
            sb.append(stack.peek());
            while(!stack.empty()){
                stack.pop();
                count++;

            }
            sb.append(count);
        }
        System.out.println(sb);


//------------------------------------------------------------------------------------------------------------------------------


        String str ="abc@#defgh$i";
        //// Expected Output = "ihg@#fedcb$a"
        char[] charArray = str.toCharArray();
        int j = 0;
        int i =charArray.length-1;
      //  StringBuilder sb = new StringBuilder();


            while(j < i){
            if(!Character.isAlphabetic(charArray[i])){
                i--;
            }
           if(!Character.isAlphabetic(charArray[j])){
               j++;
           }
           if(Character.isAlphabetic(charArray[i]) && Character.isAlphabetic(charArray[j])){
               char temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = temp;
               i--;
               j++;
           }
        }

        System.out.println( new String(charArray));
    }
}
