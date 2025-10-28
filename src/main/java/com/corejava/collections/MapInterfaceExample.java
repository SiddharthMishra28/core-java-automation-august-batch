package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
    public static void main(String[] args) {
        // INTERFACE_NAME<Key_Type, Value_Type> VARIABLE_NAME = new IMPLEMENTATION_CLASS<>();
        Map<Integer, String> myStudents = new HashMap<>();
        myStudents.put(1, "chanchal");
        myStudents.put(2, "precilla");
        myStudents.put(3, "mohit");
        System.out.println(myStudents);
        System.out.println(myStudents.get(3));
    }
}
