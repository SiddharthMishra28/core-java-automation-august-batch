package com.corejava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample {

    public static void main(String[] args) {
        int i = 10;
        Integer j = 20;
        List<Integer> myNumbers = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.addAll(otherNumbers);

        List<String> myData = new LinkedList<>();
        myData.add("asbddas");
//        MyGenericClass<String> myclass = new MyGenericClass<>();
    }
}
