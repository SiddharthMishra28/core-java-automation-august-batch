package com.corejava;

public class SingleDimensionalArray {
    // _ _ _ _ _ _ _
    // A B C .....
    // Indexes / Positions
    // Counting Starts from 0 always
    // ["Chanchal", "Precilla", "Mohit"]
    //     0             1         2
    // <DATA_TYPE>[] variable_name = new <DATA_TYPE>[4];
    // <DATA_TYPE>[] variable_name = {"chanchal", "precilla", "mohit"}
    public static void main(String[] args) {
//        String[] students = new String[5];
//        students[0] = "Chanchal";
//        students[1] = "Precilla";
//        students[2] = "Mohit";
//        students[4] = "Bhabani";
//        students[5] = "Rishab";

        String[] students = {"Chanchal", "Precilla", "Mohit", "Bhabani", "Rishab"};
        //                     0            1          2         3          4
        int[] rollNumbers = {12, 4, 7, 10, 9};
        // loop {
        //    startsFrom index 0
        //    proceeds till whatever the length of array is!
        //    print students[index]
        // }
        for(int i=0; i<5; i++) {
            System.out.println(students[i]+"-->"+rollNumbers[i]);
        }
//        for(int j=0; j<5; j++) {
//            System.out.println(rollNumbers[j]);
//        }
        // Chanchal -->  12
        // Precilla --> 4
    }
}
