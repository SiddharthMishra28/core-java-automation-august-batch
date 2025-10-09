package com.corejava.oop.asbtraction.complete;

public class Airtel implements GSM {
    @Override
    public boolean registerDevice(String deviceName) {
        // AIRTEL HARDWARE SPECIFIC CODE
        return false;
    }

    @Override
    public int getNetworkFrequency() {
        return 0;
    }

    @Override
    public void encode(String voiceSignal) {
        System.out.println("Calling with Airtel SIM...");
    }

    @Override
    public byte[] decode() {
        return new byte[0];
    }

    @Override
    public void getNetworkLocation() {
        // AIRTEL SPECIFIC CODE
    }
}
