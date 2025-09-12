package com.corejava.proceduralprogramming;

import java.util.Scanner;

public class ClassRoomDataEntry {
//    public static void main(String[] args) {
//        // STORE STUDENTS DATA INTO A SINGLE DIMENSIONAL ARRAY
//        Scanner sc = new Scanner(System.in);
//        int dataSize = 0;
//        System.out.println("Enter Number of Students : ");
//        dataSize = sc.nextInt();
//        sc.nextLine(); // TO CONSUME THE /n form feed character
////        "\n" next line character
//        String[] students = new String[dataSize];
//        for(int i=0; i<students.length; i++) {
//            System.out.println("Enter Name of Student "+(i+1)+": ");
//            students[i] = sc.nextLine();
//        }
//        System.out.println("Data Stored : ");
//        for(int j=0; j<students.length; j++) {
//            System.out.println("Student number "+(j+1)+" : "+students[j]);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Student Management System ========");
        System.out.println("Enter number of Students Data to Store : ");
        int studentDataSize = sc.nextInt();
        sc.nextLine(); // to consume /n form feed character
        String[][] studentsData = new String[studentDataSize][4];
        for(int i=0; i<studentsData.length; i++) {
            System.out.println("Enter Student Name : ");
            studentsData[i][0] = sc.nextLine();
            System.out.println("Enter Students Email : ");
            studentsData[i][1] = sc.nextLine();
            System.out.println("Enter Students Phone Number : ");
            studentsData[i][2] = sc.nextLine();
            System.out.println("Enter Students Course Enrolled : ");
            studentsData[i][3] = sc.nextLine();
        }
        System.out.println("Enrollment Complete...");
        System.out.println("Students available on system:");
        for(int j=0; j<studentsData.length; j++) {
            System.out.println("Name | Email | Phone | Course Enrolled");
            System.out.println(studentsData[j][0]+" | "+studentsData[j][1]+" | "+studentsData[j][2]+" | "+studentsData[j][3]);
        }
    }
}
