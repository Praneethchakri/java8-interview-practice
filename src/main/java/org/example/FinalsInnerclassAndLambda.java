package org.example;

public class FinalsInnerclassAndLambda {

    public static void main(String[] args) {
        int value=10;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("In Annonymous Inner Class "+10);
            }
        };


        Runnable lambda = ()->{
          System.out.println("In Lambda "+value);
        };

        r.run();
        lambda.run();
    }
}
