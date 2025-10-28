package com.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
//        Set<String> myData = new HashSet<>();
        List<String> myData = new ArrayList<>();
        myData.add("sid");
        myData.add("precilla");
        myData.add("mohit");
        System.out.println(myData);
        myData.add("mohit");
        myData.add("sid");
        System.out.println(myData);
    }
}
