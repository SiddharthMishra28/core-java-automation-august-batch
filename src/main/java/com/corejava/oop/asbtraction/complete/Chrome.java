package com.corejava.oop.asbtraction.complete;

public class Chrome implements Http{
    @Override
    public boolean Get(String url) {
        // CHROME SPECIFIC LOGIC
        System.out.println("Navigating to "+url+" using Google Chrome..");
        return true;
    }

    @Override
    public boolean Post(String data) {
        // CHROME SPECIFIC FORM SUBMISSION LOGIC
        return false;
    }

    @Override
    public int setStatusCode() {
        return 200;
    }
}
