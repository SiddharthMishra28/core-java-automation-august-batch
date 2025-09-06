package com.corejava.assignments.solutions;

public class CarGarageArrays {
    public static void main(String[] args) {
        String[] customerType = {"SILVER", "GOLD", "DIAMOND"};
        //                          0         1       2
        int[] amount = {12000, 3000, 14000};
        int[] rewardPoints = {0, 1000, 3000};
        double discountedPrice = 0;
        for(int i=0; i<5; i++) {
            if(customerType[i].equalsIgnoreCase("SILVER")) {
                System.out.println("Reward points : "+rewardPoints[0]);
                discountedPrice = amount[i] - (0.03*amount[i]);
                System.out.println("Final Amount Post Discount: "+discountedPrice);
            }else if(customerType[i].equalsIgnoreCase("GOLD")) {
                System.out.println("Reward points : "+rewardPoints[1]);
                discountedPrice = amount[i] - (0.05*amount[i]);
                System.out.println("Final Amount Post Discount: "+discountedPrice);
            }else if(customerType[i].equalsIgnoreCase("DIAMOND")) {
                System.out.println("Reward points : "+rewardPoints[2]);
                discountedPrice = amount[i] - (0.08*amount[i]);
                System.out.println("Final Amount Post Discount: "+discountedPrice);
            }
        }
    }
}
