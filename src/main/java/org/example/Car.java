package org.example;

public class Car implements Vehical,Automobile{


    @Override
    public String startEngine() {
        return Vehical.super.startEngine();
    }

    @Override
    public String stopEngine() {
        return Vehical.super.stopEngine();
    }

    @Override
    public void print() {
    System.out.println("BMW Car");
    }
}
