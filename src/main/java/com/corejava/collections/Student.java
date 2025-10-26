package com.corejava.collections;

import java.util.Arrays;

public class Student {
    private String fullName;
    private String phone;
    private String Email;
    private String[] coursesEnrolled;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String[] getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(String[] coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", Email='" + Email + '\'' +
                ", coursesEnrolled=" + Arrays.toString(coursesEnrolled) +
                '}';
    }
}
