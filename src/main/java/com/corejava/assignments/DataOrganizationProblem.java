package com.corejava.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataOrganizationProblem {
    // DESIGN A COMPOUND COLLECTION TO ACCOMMODATE ANY EXCEL SHEET WITH MULTIPLE TABS INTO JAVA SCOPE
//    public static void main(String[] args) {
////        List<Map<String, String>> excelTab = new ArrayList<>();
//        Map<String, List<Map<String, String>>> excelWorkbook = new HashMap<>();
//        List<Map<String, String>> studentSheet = new ArrayList<>();
//        Map<String, String> student1 = new HashMap<>();
//        student1.put("roll_no", "1");
//        student1.put("name", "mohit");
//        student1.put("email", "mohit@test.com");
//        student1.put("phone", "12312312");
//
//        Map<String, String> student2 = new HashMap<>();
//        student2.put("roll_no", "2");
//        student2.put("name", "precilla");
//        student2.put("email", "precilla@test.com");
//        student2.put("phone", "666454646");
//
//        studentSheet.add(student1);
//        studentSheet.add(student2);
//
//        excelWorkbook.put("students", studentSheet);
//
//        System.out.println(excelWorkbook);
//    }


    public static void main(String[] args) {
        Map<String, Object> excelWorkbook = new HashMap<>();
        Student st1 = new Student();
        st1.setName("mohit");
        st1.setEmail("mohit@gmail.com");
        st1.setPhone("37123");

        Address ad1 = new Address();
        ad1.setHouseNo("101");
        ad1.setStreet("fake street");
        ad1.setState("Maharashtra");
        ad1.setCountry("India");

        st1.setAddress(ad1);

        excelWorkbook.put("st1", st1);

        System.out.println(excelWorkbook);
    }

    public static class Student {
        private String name;
        private String email;
        private String phone;
        private Address address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    public static class Address {
        private String houseNo;
        private String street;
        private String state;
        private String country;

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
