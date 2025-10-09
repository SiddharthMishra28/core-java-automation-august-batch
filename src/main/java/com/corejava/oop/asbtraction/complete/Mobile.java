package com.corejava.oop.asbtraction.complete;

public class Mobile {
    public static void main(String[] args) {
        GSM simCard = new Bsnl();
        simCard.registerDevice("Nokia 1100");
        simCard.getNetworkFrequency();
        simCard.encode("1231231");
    }
}
