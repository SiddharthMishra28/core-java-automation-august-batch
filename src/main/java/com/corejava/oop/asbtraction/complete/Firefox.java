package com.corejava.oop.asbtraction.complete;

public class Firefox implements Http{
    @Override
    public boolean Get(String url) {
        // FIREFOX SPECIFIC LOGIC
        System.out.println("Navigating to "+url+" using Firefox..");
        return false;
    }

    @Override
    public boolean Post(String data) {
        return false;
    }

    @Override
    public int setStatusCode() {
        return 0;
    }
}
