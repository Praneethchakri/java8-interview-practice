package org.march.core.topics;

public class WildCat extends Cat{
    String catName= "WildCat";
    WildCat(){
        super();
        System.out.println("Wild Cat Class ");
        System.out.println("Cat Class "+super.color);
    }
}
