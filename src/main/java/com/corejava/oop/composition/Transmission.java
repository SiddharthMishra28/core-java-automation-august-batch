package com.corejava.oop.composition;

public class Transmission {

    private String type;
    private int numGears;
    private String manufacturer;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", numGears=" + numGears +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public int getGearAsPerSpeed(int speed) {
        if(speed > 0 && speed < 30) {
            return 1;
        }else if(speed >= 30 && speed <= 50) {
            return 2;
        }else if(speed >50 && speed <=80) {
            return 3;
        }else {
            return 4;
        }
    }
}
