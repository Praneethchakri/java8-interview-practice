package org.example;

public interface Vehical {

    default String startEngine(){
        return "Engine Started";
    }

    default String stopEngine(){
        return "Engine Stopped";
    }
    static int vehicalAvgMilage(){
        return 25;
    }

    void print();
}
