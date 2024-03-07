package org.example;

public class HeapAndStack {

    public static Person getPerson(){
        return new Person("Praneeth","Germany",33);
    }
    public static void main(String[] args) {
        int i=10;// stack memory
        String s = "Praneeth";//referance in stack and ref will point to Heap memory
        Person obj = null;//no memory allocation
        obj = getPerson();// Heap Memory
    }
}
