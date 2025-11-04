package com.corejava.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollegeManager {

    private List<College> colleges = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // CREATE / ENROLL COLLEGE
    public void addCollege() {
        System.out.println("Enter College Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter College Name : ");
        String name = sc.nextLine();
        System.out.println("Enter College Address : ");
        String address = sc.nextLine();

        College college = new College(id, name, address);
        colleges.add(college);
        System.out.println("College Added Successfully!");
    }

    // READ COLLEGE
    public void viewColleges() {
        if(colleges.isEmpty()) {
            System.out.println("No Data Available");
            return;
        }
        for(College c : colleges) {
            System.out.println(c);
        }
    }

    // UPDATE COLLEGE
    public void updateCollege() {
        //
    }

    // DELETE COLLEGE
    public void deleteCollege() {
        //
    }

    // ADD STUDENT TO A COLLEGE
    public void addStudentToCollege() {
        System.out.println("Enter College Id to Add the Student : ");
        int collegeId = sc.nextInt();
        sc.nextLine();
        College college = findCollegeById(collegeId);
        if(college == null) {
            System.out.println("Enter a valid College Id..");
            return;
        }

        System.out.println("Enter Student Id : ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name : ");
        String studentName = sc.nextLine();
        System.out.println("Enter Course : ");
        String course = sc.nextLine();
        System.out.println("Enter Enrollment Year : ");
        int year = sc.nextInt();

        Student student = new Student(studentId, studentName, course, year);
        college.addStudent(student);
        System.out.println("Student Enrolled to College Successfully...");
    }

    // VIEW ALL STUDENTS OF A COLLEGE
    public void viewStudentsOfCollege() {
        //
    }

    // REMOVE STUDENT FROM A COLLEGE
    public void removeStudentFromCollege() {
        //
    }

    public College findCollegeById(int id) {
        for(College c : colleges) {
            if(c.getCollegeId() == id) return c;
        }
        return null;
    }

}
