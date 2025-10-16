package com.corejava.oop.composition;

public abstract class Vehicle {

    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // GENERIC METHODS
    public void start() {
        System.out.println("Vehicle "+this.brand+" started.");
    }

    public void stop() {
        System.out.println("Vehicle "+this.brand+" stopped.");
    }
}
