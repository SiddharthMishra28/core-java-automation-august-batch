package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionWay {
    public static void main(String[] args) {
        // NAME_OF_INTERFACE<DATA_TYPE> = new IMPLEMENTATION_CLASS<>();
        List<Student> myStudents = new ArrayList<>();

        Student sid = new Student();
        sid.setFullName("Siddharth");
        sid.setEmail("sid@test.com");
        sid.setPhone("712937129");

        Student mohit = new Student();
        mohit.setFullName("Mohit");
        mohit.setEmail("mohit@gmail.com");
        mohit.setPhone("7123712");

        myStudents.add(sid);
        myStudents.add(mohit);

        Student chanchal = new Student();
        chanchal.setFullName("Chanchal");
        chanchal.setPhone("32221");
        chanchal.setEmail("chanchal@gmail.com");

        myStudents.add(chanchal);

        System.out.println(myStudents);
    }
}
