package com.corejava;

public class Loops {
    public static void main(String[] args) {
        // TYPES OF LOOPS
        // for, while, do while
        // for(<INITIALIZATION>; <CONDITION>; <INCREMENT / DECREMENT>) {
        // ...
        // }
//        for(int i=1; i<=100; i=i+1) {
//            System.out.println("Running Loop for "+i+" time");
//        }

        // while(<CONDITION>) {
        // ..
        // ..
        // }
//        int j=1;
//        while(j<=100) {
//            System.out.println("Running While Loop for "+j+" time");
//            j++; // INCREMENT
//        }

        // do {
        // ...
        // ...
        // }while(<CONDITION>);
        int k = 1;
        do {
            System.out.println("Running do while loop for "+k+" time");
            k++;
        }while(k<=100);
    }
}
