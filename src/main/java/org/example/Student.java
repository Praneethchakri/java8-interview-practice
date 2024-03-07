package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

    private int id;
    private String name;
    private String address;

    public Student() {

    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        /* Serialization */
        out.writeInt(id);
        out.writeObject(name);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        /*        Deserialization */
        id=in.readInt();
        name = (String)in.readObject();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
