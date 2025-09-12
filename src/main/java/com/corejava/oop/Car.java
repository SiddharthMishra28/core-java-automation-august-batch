package com.corejava.oop;

public class Car {
    String brand;
    int numWheels;
    double engineCapacity;
    String fuelType;
    boolean isPowerSteering;

    public static void main(String[] args) {
//        <CLASS / BLUEPRINT> variable = new <CLASS / BLUEPRINT> ();
        Car mercedes = new Car();
        mercedes.brand = "Diamler";
        mercedes.numWheels = 4;
        mercedes.engineCapacity = 2801.1;
        mercedes.fuelType = "Diesel";
        mercedes.isPowerSteering = true;

        Car audi = new Car();
        audi.brand = "Audi";
        audi.numWheels = 4;
        audi.engineCapacity = 3501.1;
        audi.fuelType = "Petrol";
        audi.isPowerSteering = true;
    }

}
