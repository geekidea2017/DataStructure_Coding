package com.producerconsumer.solution;

import java.util.concurrent.BlockingQueue;

/**
 *
 * Producer to produce numbers using BlockingQueue class
 */
public class Producer extends Thread{
    BlockingQueue<Integer> queue = null;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    public void run(){
        for(int i=0; i<10; i++){
            try {
                queue.put(i);
                System.out.println("Produced : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
