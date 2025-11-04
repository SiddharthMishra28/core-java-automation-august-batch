package com.corejava.project;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CollegeManager manager = new CollegeManager();
        int option;

        do {
            System.out.println("============== COLLEGE MANAGER SOFTWARE =================");
            System.out.println("1. Add College");
            System.out.println("2. view College");
            System.out.println("3. Update College");
            System.out.println("4. Delete College");
            System.out.println("5. Add Student to College");
            System.out.println("6. View Students of a College");
            System.out.println("7. Remove Student from College");
            System.out.println("8. Exit");
            System.out.println("Enter Your choice..");
            option = sc.nextInt();

            switch (option) {
                case 1: manager.addCollege();
                break;
                case 2: manager.viewColleges();
                break;
                case 3: manager.updateCollege();
                break;
                case 4: manager.deleteCollege();
                break;
                case 5: manager.addStudentToCollege();
                break;
                case 6: manager.viewStudentsOfCollege();
                break;
                case 7: manager.removeStudentFromCollege();
                break;
                case 8:
                    System.out.println("Bye...");
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        } while (option != 8);
        sc.close();
    }
}
