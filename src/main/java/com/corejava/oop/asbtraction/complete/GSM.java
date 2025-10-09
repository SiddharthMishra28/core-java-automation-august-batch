package com.corejava.oop.asbtraction.complete;

// 100% ABSTRACT BY DEFAULT
// You declare the contracts here
// Implement it in child class
public interface GSM {

    public boolean registerDevice(String deviceName);

    public int getNetworkFrequency();

    public void encode(String voiceSignal);

    public byte[] decode();

    public void getNetworkLocation();
}
