package org.example;

public class VolataileProcess {
    private static volatile int sharedValue = 0;
    private static boolean running = true;


    public static void main(String[] args) {

        VolataileProcess object = new VolataileProcess();

            Thread writeThread = new Thread(() -> {
                while (running) {
                        sharedValue++;
                        int value = sharedValue;
                        System.out.println("SharedValue While write " + value);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
            });


        Thread readThread = new Thread(()->{
           while(running){
               int value = sharedValue;
               System.out.println("Value of Shared Value while Read "+value);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        writeThread.start();
        readThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        running=false;
        try {
            writeThread.join();
            readThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    System.out.println("Shared value At end "+sharedValue);
    }


}
