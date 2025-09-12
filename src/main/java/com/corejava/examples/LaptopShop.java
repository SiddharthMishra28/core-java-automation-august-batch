package com.corejava.examples;

import java.util.Scanner;

public class LaptopShop {
    String name;
    String address;
    String owner;
    String[] brands;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a new Shop : ");
        LaptopShop globalComputers = new LaptopShop();
        System.out.println("Enter Shop Name : ");
        globalComputers.name = sc.nextLine();
        System.out.println("Enter Shop Address : ");
        globalComputers.address = sc.nextLine();
        System.out.println("Enter shop Owners Name : ");
        globalComputers.owner = sc.nextLine();
        System.out.println("Enter brands which are available in your shop");
        System.out.println("Enter Number of Brands : ");
        int numBrands = sc.nextInt();
        sc.nextLine();// CONSUME \n FORMFEED
        globalComputers.brands = new String[numBrands];
        for(int i=0; i<numBrands; i++) {
            System.out.println("Enter brand "+(i+1));
            globalComputers.brands[i] = sc.nextLine();
        }
    }
}
