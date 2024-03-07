package org.example;

public class ThreadCheck {
    public volatile String lastUserName;

    private volatile int sharedValue = 0;


    public void thread1Method() {
        System.out.println("While Thread-1 "+ sharedValue);
        sharedValue = 32;
                System.out.println("While Thread-1 "+ sharedValue);
    }

    public void thread2Method() {
        int value = sharedValue;
        System.out.println("While Thread-2 Access "+value);

    }


    public static void main(String[] args) {

         ThreadCheck t = new ThreadCheck();

        Thread t1 = new Thread(()->{
            t.thread1Method();

        });

        Thread t2 = new Thread(()->{
                t.thread2Method();
    });
        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

