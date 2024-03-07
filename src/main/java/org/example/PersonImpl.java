package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonImpl {

    public static void main(String[] args) {

        List<Person> listPerson = new ArrayList<>();
            listPerson.add(new Person("Praneeth","Germany",33));
            listPerson.add(new Person("Suresh","Germany",31));
            listPerson.add(new Person("Ramesh","Germany",29));
            listPerson.add(new Person("Kumar","Germany",28));
            listPerson.add(new Person("Prasanth","Germany",45));
        System.out.println(""+listPerson);
        Collections.sort(listPerson,Comparator.comparingInt(Person::getAge).reversed());

System.out.println(""+listPerson.get(2).getAge());


    }
}
