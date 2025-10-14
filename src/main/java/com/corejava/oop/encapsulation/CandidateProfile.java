package com.corejava.oop.encapsulation;

public class CandidateProfile {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String[] companies;
    private String password;

    public void setFirstName(String firstName) {
        if(!firstName.equalsIgnoreCase("")) {
            this.firstName = firstName;
        }else {
            System.out.println("Invalid Input!...firstName is required field");
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        if(password.length() < 8) {
            System.out.println("Password should be atleast 8 characters long");
        }else {
            this.password = password;
        }
    }

    public String getPassword() {
        return "*******";
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }
}
