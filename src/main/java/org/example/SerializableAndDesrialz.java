package org.example;

import java.io.*;

public class SerializableAndDesrialz {

/*
Serialization: Write the Object as Byte stream
Desrialization : Read the object from Byte Stream and convert it as Object
 */
public static void main(String[] args) {

        try {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.ser"));
        oos.writeObject(new Person("Praneeth","Germany",33));
        System.out.println("Serialized Object "+oos.toString());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.ser"));
        try {
            Person p =(Person) ois.readObject();
            System.out.println("Deserialized Person Data from file to Object"+p);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}


}
