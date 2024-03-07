package org.linkedlist.ds;

public class SearchinSLL {
    public static void main(String[] args) {
        LinkedListImpl obj = new LinkedListImpl();
        obj.insert(1);
        obj.insert(21);
        obj.insert(11);
        obj.insert(31);
        obj.insert(1);
        obj.insert(15);
        obj.insert(41);

        obj.displayLinkedList();
        System.out.println(obj.findValue(15));


    }
}
