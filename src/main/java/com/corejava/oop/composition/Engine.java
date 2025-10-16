package com.corejava.oop.composition;

public class Engine {
    private String engineMake;
    private double displacement;
    private int maxTorque;

    public String getEngineMake() {
        return engineMake;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineMake='" + engineMake + '\'' +
                ", displacement=" + displacement +
                ", maxTorque=" + maxTorque +
                '}';
    }
}
