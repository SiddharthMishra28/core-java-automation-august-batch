package com.corejava.project;

import java.util.ArrayList;
import java.util.List;

public class College {

    private int collegeId;
    private String collegeName;
    private String address;
    private List<Student> students = new ArrayList<>(); // 1 TO MANY

    public College(int collegeId, String collegeName, String address) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.address = address;
        this.students = students;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", address='" + address + '\'' +
                ", students=" + students +
                '}';
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
