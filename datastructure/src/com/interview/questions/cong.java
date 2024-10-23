package com.interview.questions;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class cong {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);
        BlockingQueue<Integer> bq = new LinkedBlockingDeque<>();
        service.execute(new Thread());
    //Runnable r = new FutureTask<Integer>(service);
        for(int i=0; i< 5; i++){
            bq.put(i);
        }
       // service.execute();

//first repeated char from a string using java 8
//javaj
//a

   String s = "javaj";
        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Set<Character> set = new HashSet<Character>();
        Optional<Character> value = list.stream().filter(a -> !set.add(a)).findFirst();
        System.out.println(value.toString());

    }
    
}
