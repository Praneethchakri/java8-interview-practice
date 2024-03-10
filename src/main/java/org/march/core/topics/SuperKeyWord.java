package org.march.core.topics;

public class SuperKeyWord extends WildCat {

    SuperKeyWord(){
        super();
        System.out.println("WildCat "+super.catName);
        System.out.println("SuperKEyWord Class Called After Super");
    }
    public static void main(String[] args) {
    new SuperKeyWord();
    System.out.println("At the end statement");
    }

}
