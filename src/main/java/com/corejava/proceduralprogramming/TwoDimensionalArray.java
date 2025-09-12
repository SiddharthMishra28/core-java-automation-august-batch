package com.corejava.proceduralprogramming;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        ---------------->
//        - data, data, data
//        - data, data, data
//        - data, data, data
//        - data, data, data
//       String[][] students = new String[3][4];
        String[][] students = {
                {"name", "email", "phone", "course"},
             //   0, 0    0, 1     0, 2     0, 3
                {"sid", "sid@test.com", "732173981", "AI", "Some Value"},
             //   1, 0    1, 1            1, 2
                {"mohit", "mohit@test.com", "7392179", "ML"}
             //                                2, 2
        };
        int[][] rollNumbers = {
                {0, 1, 2, 4, 5, 6 }, // NON SYMMETRIC DATA IS ACCEPTABLE
                {7, 8, 9, 10}
        };
        System.out.println(students[1][2]);
    }
}
