package org.daily.practice.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("Praneeth");
        q.add("Pranay");
        q.add("Pramod");

//add(element e);
//offer(element e);

//peek(); first element from front
//element(); first element from front
//
//remove(); removes the first element from front
//poll(); //remove the first element from front

//size();// size of queue

        System.out.println(q.peek());
        System.out.println(q.element());

        q.poll();
        System.out.println(q.element());
        q.stream().forEach(System.out::println);

    }
}
