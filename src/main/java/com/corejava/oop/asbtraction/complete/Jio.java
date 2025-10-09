package com.corejava.oop.asbtraction.complete;

public class Jio implements GSM {
    @Override
    public boolean registerDevice(String deviceName) {
        // JIO HARDWARE SPECIFIC CODE
        if(deviceName != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getNetworkFrequency() {
        // JIO HARDWARE SPECIFIC CODE
        return 3600;
    }

    @Override
    public void encode(String voiceSignal) {
        String.valueOf(Integer.parseInt(voiceSignal));
        System.out.println("Calling with JIO SIM...");
    }

    @Override
    public byte[] decode() {
        return new byte[0];
    }

    @Override
    public void getNetworkLocation() {
        // JIO SPECIFIC NETWORK FETCHING CODE
    }
}
