package com.corejava.oop.encapsulation;

public class Airline {
    // ACCESS SPECIFIERS / ACCESS MODIFIERS
    // 1. public - ACCESSIBLE INSIDE ENTIRE PROJECT
    // 2. protected - ONLY ACCESSIBLE INSIDE CHILD CLASSES IN OTHER PACKAGES (GETTER /
    // SETTER)
    // 3. private - ACCESSIBLE ONLY INSIDE THE BODY OF SAME CLASS
    // 4. default - NO MENTION OF ACCESS SPECIFIER LEADS TO DEFAULT

    private String name;
    private String[] servingCountries;

    // WRAPPER TO WRITE A VALUE
    public void setName(String name) {
        this.name = name;
    }

    // WRAPPER TO READ A VALUE
    public String getName() {
        return this.name;
    }
}
