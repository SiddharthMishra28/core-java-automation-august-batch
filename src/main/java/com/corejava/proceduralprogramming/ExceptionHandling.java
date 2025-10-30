package com.corejava.proceduralprogramming;

public class ExceptionHandling {

    public static void main(String[] args) {
        String[] myData = new String[3];
        try{
            myData[0] = "abc";
            myData[1] = "def";
            myData[2] = "pqr";
            myData[3] = "qwe";
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("More elements inserted than expected...");
        }

        try{
            double result = 10/0;
        }catch (Exception e) {
            System.out.println("Denominator cannot be zero..");
        }

        // try catch
        // try {
        // ... logic
        // } catch(<TYPE OF EXCEPTION>){
        // ...
        // }

    }
}
