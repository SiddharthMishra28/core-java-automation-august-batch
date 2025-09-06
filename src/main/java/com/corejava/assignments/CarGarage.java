package com.corejava.assignments;

public class CarGarage {
    public static void main(String[] args) {
        // DEPENDING ON TYPE OF CUSTOMER
        // ASSIGN REWARD POINTS AND DISCOUNT
        // IF CUSTOMER IS SILVER - NO REWARD POINTS - DISCOUNT 3%
        // IF CUSTOMER IS GOLD - 1000 REWARD POINTS - DISCOUNT 5%
        // IF CUSTOMER IS DIAMOND - 3000 REWARD POINTS - DISCOUNT 8%
        // 5 DIFFERENT CUSTOMERS IN A DAY OF ANY GIVEN TYPE
        // CALCULATE AND SHOW BILLS FOR AMM 5 DIFFERENT CUSTOMERS IN A LOOP
//        String customerType = "GOLD";
//        1000 - 1500;
        String customerType = "GOLD";
        int amount = 3000;
        double discountedPrice = 0;
        for(int i=1; i<=5; i++) {
            amount = amount + 1200;
            if (customerType.equalsIgnoreCase("SILVER")) {
                System.out.println("No Rewards Applicable. Discount of 3% ");
                discountedPrice = amount - (0.03 * amount);
                System.out.println("Final Price is : "+discountedPrice);
            } else if (customerType.equalsIgnoreCase("GOLD")) {
                System.out.println("1000 Reward Points added. Discount of 5% ");
                discountedPrice = amount - (0.05 * amount);
                System.out.println("Final Price is : "+discountedPrice);
            } else if (customerType.equalsIgnoreCase("DIAMOND")) {
                System.out.println("3000 Reward Points added. Discount of 8% ");
                discountedPrice = amount - (0.08 * amount);
                System.out.println("Final Price is : "+discountedPrice);
            }
        }
    }
}
