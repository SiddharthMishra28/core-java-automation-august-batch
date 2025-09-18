package com.corejava.oop.polymorphism;

public class DesignerSoftware {
    public int calcArea(int length, int width) {
        return length * width;
    }

    public double calcArea(int length, int width, boolean isTriangle) {
        return 0.5* length * width;
    }

    public static void main(String[] args) {
        DesignerSoftware software = new DesignerSoftware();
        Square sq = new Square(5, 4);
        double area = software.calcArea(sq.length, sq.width);
        System.out.println(area);
    }
}
