package com.corejava.examples.oop.inheritance;

public class Patient {
    String name;
    int age;
    String addreess;
    String[] medicalConditions;
    String[] tests;

    // Reusable Functions
    // Generate Receipt
    // Generate Digital Prescription
    // <ACCESS_SPECIFIER> <RETURN_TYPE / OUTPUT> <METHOD_NAME>(...arguments / <INPUTS>) {
    // .....
    // }
    public int generateReceipt(String name, String testConducted) {
        int totalBill = 0;
        System.out.println("Generating Receipt for Patient "+name);
        if(testConducted.equalsIgnoreCase("PATHOLOGY")) {
            totalBill+=1500;
        }else if(testConducted.equalsIgnoreCase("RADIOLOGY")) {
            totalBill+=4000;
        }
        return totalBill;
    }

    public static void main(String[] args) {
        Patient p = new Patient();
//        int total = p.generateReceipt("Abc", "RADIOLOGY");
//        System.out.println(total);
        System.out.println(p.generateReceipt("ABC", "RADIOLOGY"));
    }
}
