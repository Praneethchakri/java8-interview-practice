package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicImpl {

    private AtomicInteger atomicInt = new AtomicInteger(0);

    public void doIncrement(){
        atomicInt.incrementAndGet();
    }
    public int getCounter(){
    return atomicInt.get();
    }
    public static void main(String[] args) {
    AtomicImpl object = new AtomicImpl();
//    int value = object.getCounter();
    System.out.println("Value while startup "+object.getCounter());
        Thread t1 = new Thread(()->{

            while(object.getCounter()<10) {
                System.out.println("Value while startup entered 2 "+object.getCounter());
                object.doIncrement();
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    new RuntimeException();
                }
            }

        });

        Thread t2 = new Thread(()->{
            System.out.println("Value while startup entered 3 "+object.getCounter());
           while(object.getCounter()>5){
               System.out.println("Access the counter Value "+object.getCounter());
           }
        });

        t1.start();
        t2.start();

try {
    Thread.sleep(5000);
}catch(InterruptedException ex){
    new RuntimeException();
}
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
