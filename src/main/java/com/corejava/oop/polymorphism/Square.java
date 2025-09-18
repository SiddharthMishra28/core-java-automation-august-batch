package com.corejava.oop.polymorphism;

public class Square extends Dimensions {
    boolean isPixel;

    public Square(int lengh, int width) {
        this.length = lengh;
        this.width = width;
        this.isPixel = true;
    }
}
