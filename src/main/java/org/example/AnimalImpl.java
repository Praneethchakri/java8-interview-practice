package org.example;

public class AnimalImpl implements Animal {
private String name;
private int age;

    public AnimalImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AnimalImpl() {

    }

    @Override
    public void methodcheck() {
        System.out.println("Checking animal ");
    }

    public static void main(String[] args) {
        Animal object = new AnimalImpl();
        String s=null;
        Object object1=null;
        System.out.println(object.name);
        System.out.println(object.age);
    }
}
