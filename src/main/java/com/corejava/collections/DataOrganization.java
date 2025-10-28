package com.corejava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataOrganization {
    public static void main(String[] args) {
        // WRONG WAY
//        Map<Integer, String[]> studentMap = new HashMap<>();
//        studentMap.put(1, new String[]{"mohit", "mohit@test.com", "301283012"});
//        System.out.println(studentMap.get());
        // COMPOUND COLLECTION
        List<Map<String, String>> studentData = new ArrayList<>();
        Map<String, String> student1 = new HashMap<>();
        student1.put("roll_no", "1");
        student1.put("name", "mohit");
        student1.put("email", "mohit@test.com");
        student1.put("phone", "12312312");

        studentData.add(student1);

        Map<String, String> student2 = new HashMap<>();
        student2.put("roll_no", "2");
        student2.put("name", "precilla");
        student2.put("email", "precilla@test.com");
        student2.put("phone", "666454646");

        studentData.add(student2);

        System.out.println(studentData);

        System.out.println(studentData.get(1).get("phone"));
    }
}
