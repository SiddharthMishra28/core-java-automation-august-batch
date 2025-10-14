package com.corejava.oop.encapsulation;

public class LinkedIn {
    public static void main(String[] args) {
        CandidateProfile profile = new CandidateProfile();
        profile.setFirstName("");
        profile.setLastName("");
        profile.setEmail("sid@gmail.com");
        profile.setPassword("12312312312312");

        System.out.println(profile.getPassword());
    }
}
