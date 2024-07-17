package com.producerconsumer.solution;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
BlockingQueue<Integer> queue = null;

public Consumer(BlockingQueue<Integer> queue){
    this.queue = queue;
}
public void run(){
    while(true){
        try {
            Thread.sleep(2000);
            Integer item = queue.take();
            System.out.println(" Consumer... "+item);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}
