package com.corejava.collections;

import java.util.Scanner;

public class NonCollectionWay {

    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students to Store : ");
        int studentNum = sc.nextInt();
        Student[] students = new Student[studentNum];
        int option;
        while (isRunning) {
            System.out.println("Select option from below menu: ");
            System.out.println("1. Enroll a Student");
            System.out.println("2. Modify Student Data");
            System.out.println("3. View Student Data");
            System.out.println("4. Delete Student Data");
            option = sc.nextInt();
            int i=0;
            switch (option) {
                case 1:
                    i++;
                    sc.nextLine();
                    Student student = new Student();
                    System.out.println("Enter Students Full Name : ");
                    String fullName = sc.nextLine();
                    student.setFullName(fullName);
                    System.out.println("Enter Students Phone : ");
                    String phone = sc.nextLine();
                    student.setPhone(phone);
                    System.out.println("Enter Students Email : ");
                    String email = sc.nextLine();
                    student.setEmail(email);
                    System.out.println("Enter Students Courses Enrolled in Comma Separated Manner : ");
                    String[] courses = sc.nextLine().split(",");
                    student.setCoursesEnrolled(courses);
                    students[i] = student;
                    System.out.println("Detailed Saved are : ");
                    System.out.println(student);
                    break;
                case 2:
                    // MODIFY LOGIC
                    break;
                case 3:
                    // READ LOGIC
                    break;
                case 4:
                    // DELETE LOGIC
                    break;
                default:
                    System.out.println("Wrong option selected.. please select a valid one");
                    break;
            }
        }
    }
}
