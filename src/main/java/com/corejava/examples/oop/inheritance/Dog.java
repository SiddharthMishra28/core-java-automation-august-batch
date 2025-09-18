package com.corejava.examples.oop.inheritance;

public class Dog extends Animal {
    boolean isOneMaster;

    public void play() {
        System.out.println("Dog started playing..");
    }

    public static void main(String[] args) {
        Dog pug = new Dog();
        pug.isOneMaster = false;
        pug.name = "Pug";
        pug.habitat = "Domestic";
        pug.species = "Homo Sapiens";
        pug.makeSound();
        pug.move();
        pug.play();
    }
}
