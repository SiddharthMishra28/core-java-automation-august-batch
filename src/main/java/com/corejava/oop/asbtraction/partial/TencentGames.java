package com.corejava.oop.asbtraction.partial;

public class TencentGames extends GraphicsThreeDimensional{
    public static void main(String[] args) {
        TencentGames pubg = new TencentGames();
        pubg.calculateVolume();
        pubg.initiateShadows(true);
    }

    @Override
    public String renderShadowOnObject(String wall) {
        // shadow render logic
        return null;
    }

    public void shoot() {
        // BULLET FIRE LOGIC
    }
}
