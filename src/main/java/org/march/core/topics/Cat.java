package org.march.core.topics;

public class Cat extends Animal{

    String color = "Brown";
    Cat(){
        System.out.println("Caaling Cat Class....");
        System.out.println("Calling Super Class Vaiable "+super.color);
        System.out.println("Calling Current class Vaialbe "+color);
    }
}
