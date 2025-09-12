package com.corejava.proceduralprogramming;

import java.util.Scanner;

public class MobilePhoneShop {
    public static void main(String[] args) {
//        String make;
//        String model;
//        double price;
//
//        String make2;
//        String model2;
//        double price2;
//        String[][] mobiles = new String[3][3]; //  WE WANT SOME COLLECTION OF DATA
        // WHERE EACH DATA ELEMENT IS IDENTIFIED BY INDEXES

        Scanner sc = new Scanner(System.in);
        int rowCount;
        int colCount;
        System.out.println("Enter Number of Rows : ");
        rowCount = sc.nextInt();
        System.out.println("Enter Number of Columns : ");
        colCount = sc.nextInt();
        sc.nextLine();
        String[][] mobiles = new String[rowCount][colCount];
        for(int i=0; i<rowCount; i++) {
            System.out.println("Enter Make for Row "+i);
            mobiles[i][0] = sc.nextLine();
            System.out.println("Enter Model for Row "+i);
            mobiles[i][1] = sc.nextLine();
            System.out.println("Enter Price for Row "+i);
            mobiles[i][2] = sc.nextLine();
        }

        System.out.println("Your mobile phone data : ");
        for(int j=0; j<mobiles.length; j++) {
            System.out.println(" Make | Model | Price");
            System.out.println(mobiles[j][0]+" | "+mobiles[j][1]+" | "+mobiles[j][2]);
        }
    }
}
