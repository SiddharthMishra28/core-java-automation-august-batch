package com.corejava.oop;

public class Mobile {
    double screenSize;
    String os;
    int ram;

    public static void main(String[] args) {
        Mobile iphone = new Mobile();
        iphone.screenSize = 6.1;
        iphone.os = "iOS";
        iphone.ram = 4;

        Mobile samsungPhone = new Mobile();
        samsungPhone.screenSize = 7.1;
        samsungPhone.ram = 8;
        samsungPhone.os = "Android";
    }
}
