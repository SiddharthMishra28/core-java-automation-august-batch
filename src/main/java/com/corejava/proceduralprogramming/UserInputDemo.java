package com.corejava.proceduralprogramming;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = sc.nextLine();
        System.out.println("Hello there! "+name);
    }
}
