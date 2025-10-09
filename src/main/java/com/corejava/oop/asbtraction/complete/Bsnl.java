package com.corejava.oop.asbtraction.complete;

public class Bsnl implements GSM{
    @Override
    public boolean registerDevice(String deviceName) {
        // BSNL SPECIFIC HARDWARE CODE
        return false;
    }

    @Override
    public int getNetworkFrequency() {
        return 0;
    }

    @Override
    public void encode(String voiceSignal) {
        // BSNL SPECIFIC CODE
    }

    @Override
    public byte[] decode() {
        return new byte[0];
    }

    @Override
    public void getNetworkLocation() {

    }
}
