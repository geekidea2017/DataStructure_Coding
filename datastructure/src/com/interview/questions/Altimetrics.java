package com.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Altimetrics {

  /*  private static Altimetrics altimetrics = null;

    private Altimetrics(){

    }

    public static Altimetrics  getInstance(){


           if(altimetrics == null){

               synchronized (altimetrics ){
               altimetrics = new Altimetrics();
                }

        }

        return altimetrics;
    }
*/


 public static void main(String[] arg){
     int[] array = {1,2,3,4};
     // 2,1

     boolean isPresent = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().isPresent();

     if(! isPresent){
         Optional<Integer> value = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
         System.out.println(value);
     }else{
         Optional<Integer> value =  Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
         System.out.println(value);
     }

     Integer s = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().orElse(Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());
     System.out.println(s);
 }

}
