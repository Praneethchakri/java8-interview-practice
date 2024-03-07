package org.linkedlist.ds;

public class Node {
     int value;
     Node next;

    Node(int value){
        this.value = value;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
