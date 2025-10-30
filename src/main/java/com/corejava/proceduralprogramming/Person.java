package com.corejava.proceduralprogramming;

public class Person {
    private String name;
    private int age;
    private String adhaar;
    static String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(String adhaar) {
        this.adhaar = adhaar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adhaar='" + adhaar + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person.species = "HOMO SAPIENS";

        Person p1 = new Person();
        p1.setName("abc");
        p1.setAge(14);
        p1.setAdhaar("adkhasdkhashdask");

        Person p2 = new Person();
        p2.setName("def");
        p2.setAge(16);
        p2.setAdhaar("67666dfasfas23");

    }
}
