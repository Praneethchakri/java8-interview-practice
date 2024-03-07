package org.daily.practice.queue;

public class Queue_Day1 {
    public static int front,rear,capacity;
    public static int[]queue;

    Queue_Day1(int size){
        front=rear=0;
        capacity =size;
        queue = new int[capacity];
    }

    static void queueEnque(int value){
        if(capacity==rear){
            System.out.println("Queue is Full..");
            return;
        }else{
            queue[rear] = value;
            rear++;
        }return;
    }

    static void queueDeqeue(){
        if(front==rear){
            System.out.println("Queue is Empty..");
        return;
        }else{

            for(int i =0;i<rear-1;i++){
                queue[i]=queue[i+1];
            }
    System.out.println("Rear "+rear);
            System.out.println("capacity "+capacity);
            if(rear<capacity)
                queue[rear] = 0;
                rear--;
        }
        System.out.println("Rear "+rear);
        System.out.println("capacity "+capacity);
        return;
    }
    static void display(){
        int i;
        if(rear==front){
            System.out.println("Queue is Empty..");
            return;
        }else{

            for(i = front;i<rear;i++){
                System.out.printf("%d, ",queue[i]);

            }
        }

    }

    static void frontElement(){
        if(front==rear){
            System.out.println("Queue is emptry");
        }else{
            System.out.println("Queue is Front elements "+ queue[front]);
        }
    }



}
