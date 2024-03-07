package org.example;

public class Bus implements Vehical,Automobile{

    @Override
    public String startEngine() {
        return Automobile.super.startEngine();
    }

    @Override
    public String stopEngine() {
        return Automobile.super.stopEngine();
    }

    @Override
    public void print() {
        System.out.println("Bharath Benz bus");
    }
}
