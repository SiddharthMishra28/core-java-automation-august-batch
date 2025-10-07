package com.corejava.oop.polymorphism;

public class Computer {
    String os;
    String make;
    int ramCapacity;

    public Computer(){
        this.os = "Windows";
        this.make = "Lenovo";
        this.ramCapacity = 4;
    }

    public Computer(String os, String make, int ramCapacity) {
        this.os = os;
        this.make = make;
        this.ramCapacity = ramCapacity;
    }

    public void bootUp() {
        System.out.println("Booting up "+this.make+" with os : "+this.os);
    }

    public void shutDown() {
        System.out.println("Shutting down...");
    }
}
