package com.corejava.oop.inheritance;

// keyword - extends to inherit properties from another parent class
public class Car extends Vehicle {
    String model;
    String yearOfReleease;

    public static void main(String[] args) {
        Car santro = new Car();
        santro.model = "Xing";
        santro.yearOfReleease = "2013";
        santro.numWheels = 4;
        santro.make = "Hyundai";
        santro.number = "MH-12-";
    }
}
