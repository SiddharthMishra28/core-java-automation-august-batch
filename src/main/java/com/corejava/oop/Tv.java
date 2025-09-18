package com.corejava.oop;

public class Tv {
    String brand;
    int screenSize;
    boolean isSmartTv;

    public Tv(String brand, int screenSize, boolean isSmartTv) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmartTv = isSmartTv;
        System.out.println("New TV "+this.brand+ " started..");
    }

    public void changeChannel(int channel) {
        System.out.println("Switched to "+channel);
    }

    public static void main(String[] args) {
        Tv lgTv = new Tv("LG", 70, true);
        lgTv.changeChannel(100);
//        lgTv.brand = "LG";
//        lgTv.screenSize = 42;
    }
}
