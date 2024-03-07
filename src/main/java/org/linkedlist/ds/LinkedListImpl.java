package org.linkedlist.ds;

public class LinkedListImpl {

    Node head;

    // insert,search,display
    public void insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void displayLinkedList(){
        Node current = head;
            while(current!=null){
                System.out.println(current.value+ "-->");
                current= current.next;
            }
        System.out.println("null");

    }

    public boolean findValue(int value){
        Node current = head;
        while(current!=null){
            if(current.value==value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
