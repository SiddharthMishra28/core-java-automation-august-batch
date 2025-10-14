package com.corejava.oop.composition;

public class Mobile {
    private Screen screen; // HAS - A RELATIONSHIP
    private OperatingSystem os;

    private void setLcdScreen(Screen screen) {
        this.screen = screen;
    }

    private void setOperatingSystem(OperatingSystem os) {
        this.os = os;
    }

    public Screen getScreen() {
        return screen;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public static void main(String[] args) {
        Screen amoledScreen = new Screen();
        amoledScreen.setSize(6.5);
        amoledScreen.setColors(10L);
        amoledScreen.setType("AMOLED");

        OperatingSystem android = new OperatingSystem();
        android.setName("Android IceCream Sandwich");
        android.setVersion(23.0);

        Mobile samsungGalaxy = new Mobile();
        samsungGalaxy.setLcdScreen(amoledScreen);
        samsungGalaxy.setOperatingSystem(android);
    }
}
