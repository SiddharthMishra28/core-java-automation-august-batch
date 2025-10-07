package com.corejava.oop.polymorphism;

public class Laptop extends Computer{
    double screenSize;
    String[] softwares;
    public Laptop() {
        System.out.println("Laptop booting up...");
    }

    // OVERRIDING - Overrides parents method with local method
    // Condition - Should have exact method signature as parent!
    public void bootUp() {
        System.out.println("Booting up "+this.make+ " With Linux");
    }

    // OVERLOADING
    // switches method in terms of input / arguments provided
    public void bootUp(String networkOs) {
        System.out.println("Booting up "+this.make+" with "+networkOs);
    }

    // FURTHER OVERLOADED WITH 2 ARGUMENTS
    public void bootUp(String networkOs, int ramCapacity) {
        System.out.println("Booting up "+this.make+" with "+networkOs+" and Ram : "+ramCapacity);
    }

    public static void main(String[] args) {
        Laptop yoga = new Laptop();
        System.out.println(yoga.ramCapacity);
        yoga.bootUp("Solaris", 8);
    }
}
