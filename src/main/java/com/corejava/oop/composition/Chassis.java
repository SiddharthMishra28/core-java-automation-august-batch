package com.corejava.oop.composition;

public class Chassis {

    private String chassisType;
    private String material;
    private String platform;

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "chassisType='" + chassisType + '\'' +
                ", material='" + material + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
