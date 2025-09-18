package com.corejava.examples.oop.inheritance;

public class Animal {
    String species;
    String habitat;
    String name;

    public void makeSound() {
        System.out.println(name + " is making sound!");
    }

    public void move() {
        System.out.println(name + " is moving...");
    }
}
