package org.march.core.topics;

public class ThisClass1 {
    int x=5;
    static int y=10;

    ThisClass1(){
        this(10);
        System.out.println("value of instance Variablbe"+x);
        System.out.println("this KEyWord with default constuctor");
    }
    ThisClass1(int x){
        this.x=x;
        System.out.println("Calling parameter constuctor with new value "+x);
        System.out.println("Calling static Value "+y);
    }

    public static void main(String[] args) {

        new ThisClass1();
    }

}
