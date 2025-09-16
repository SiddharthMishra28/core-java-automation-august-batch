package com.corejava.examples.oop.inheritance;

public class CardiacPatient extends Patient {
    String[] medications;
    String ecgMonitor;

    public static void main(String[] args) {
        CardiacPatient cp = new CardiacPatient();
        cp.name = "Mr abcd";
        cp.age = 54;
        cp.medicalConditions = new String[]{"Blood Pressure"};
        System.out.println(cp.generateReceipt(cp.name, "PATHOLOGY"));
    }
}
