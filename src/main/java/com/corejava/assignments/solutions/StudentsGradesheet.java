package com.corejava.assignments.solutions;

public class StudentsGradesheet {
    public static void main(String[] args) {
        String[] students = {"sid", "mohit", "chanchal", "precilla"};
        int[] marks = {345, 367, 456, 432};
        //             0     1    2    3
        char grade;
        for(int i=0; i<marks.length; i++) {
            double percentageMarks = ((double)marks[i] / 500) * 100;
            if(percentageMarks < 30) {
                grade = 'F';
            }else if(percentageMarks >=30 && percentageMarks<=40) {
                grade = 'D';
            }else if(percentageMarks >=40 && percentageMarks <=60) {
                grade = 'C';
            }else if(percentageMarks >=60 && percentageMarks <=80) {
                grade = 'B';
            }else {
                grade = 'A';
            }
            System.out.println("Name : "+students[i]+" Percentage Obtained "+percentageMarks+" Grade : "+grade);
        }
    }
}
