package org.example;

public class VoltaileDetails {

    private volatile int value=0;

    private void valueCheck(){
        synchronized (this){
            value++;
            System.out.println("Value "+value);
        }

    }
    public static void main(String[] args) {
        VoltaileDetails object = new VoltaileDetails();
        Thread[] thread = new Thread[5];

        for(int i=0;i<thread.length;i++){
            thread[i] = new Thread(()->{
               object.valueCheck();
            });
            thread[i].start();
        }
try {
    for (Thread t : thread) {
            t.join();
        }
}catch (InterruptedException e) {
    throw new RuntimeException(e);
}
    }
}
