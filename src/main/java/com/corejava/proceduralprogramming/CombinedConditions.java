package com.corejava.proceduralprogramming;

public class CombinedConditions {
    public static void main(String[] args) {
        int i=12;
        int j=16;
        System.out.println((i>10 && j<16));
        // true && true - true
        // false && false - false
        // true && false - false
        System.out.println((i>10 || j<16));
        // true || true - true
        // false || true - true
        // false || false - false
    }
}
