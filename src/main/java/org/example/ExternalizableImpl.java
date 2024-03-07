package org.example;

import java.io.*;

public class ExternalizableImpl {

    public static void main(String[] args) {


        /*Serialization*/
           try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.ser"));
                oos.writeObject(new Student(1,"Praneeth","Germany"));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


           /*Deserialization*/

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"));
            try {
                Student s = (Student)ois.readObject();
                System.out.println("Deseralized Data "+s.toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
