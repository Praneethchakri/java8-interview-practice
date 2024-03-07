package org.daily.practice.queue;

import java.util.LinkedList;

public class QueueArrayImpl {
    public static void main(String[] args) {

        Queue_Day1 q = new Queue_Day1(5);
        LinkedList<String> l = null;

        q.queueEnque(6);
        q.queueEnque(9);
        q.queueEnque(12);
        q.queueEnque(11);
        q.queueEnque(14);


        q.display();
        q.queueDeqeue();
        System.out.println("/n");
        q.display();
        q.queueEnque(15);
        System.out.println("\n");
        q.display();
        System.out.println("\n");
        q.queueEnque(16);
        q.frontElement();
    }
}
