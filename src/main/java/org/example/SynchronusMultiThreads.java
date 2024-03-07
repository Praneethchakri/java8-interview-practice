package org.example;

public class SynchronusMultiThreads {


    private int counter=0;

    public void incrementCounter(){
        synchronized (this){
            counter++;
        }
    }
    public int getCounter(){
        synchronized (this){
            return counter;
        }
    }
    public static void main(String[] args) {

        SynchronusMultiThreads object = new SynchronusMultiThreads();


        Thread[]threds = new Thread[5];

        for(int i=0;i<threds.length;i++){
            threds[i] = new Thread(()->{
                for(int j=0;j<1000;j++){
                    object.incrementCounter();
                }
            });
            threds[i].start();
        }
        try {
        for (Thread t :threds) {
                t.join();
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    System.out.println(object.getCounter());
    }
}
