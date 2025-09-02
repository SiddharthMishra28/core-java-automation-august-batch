package com.corejava.assignments.solutions;

public class DiscountCalculator {
    public static void main(String[] args) {
        int amount = 8900;
        int discountPercent;
        double postDiscountAmount;
        if(amount < 5000) {
            System.out.println("No Discount Applicable");
            System.out.println("Amount is : "+amount);
        }else if(amount >= 5000 && amount <= 10000) {
            System.out.println("5% Discount Applicable");
            discountPercent = 5;
            postDiscountAmount = (amount - (amount * 0.05));
            System.out.println("Final Amount is : "+postDiscountAmount);
        }else if(amount > 10000 && amount <= 15000) {
            System.out.println("7% Discount Applicable");
            discountPercent = 7;
            postDiscountAmount = (amount - (amount * 0.07));
            System.out.println("Final Amount is : "+postDiscountAmount);
        }else {
            System.out.println("10% Discount Applicable");
            discountPercent = 10;
            postDiscountAmount = (amount - (amount * 0.1));
            System.out.println("Final Amount is : "+postDiscountAmount);
        }
    }
}
