package com.corejava.oop.asbtraction.partial;

// PARTIAL ABSTRACTION
public abstract class GraphicsThreeDimensional {

    int length;
    int width;
    int height;

    public int calculateVolume() {
        return this.length * this.width * this.height;
    }

    public int calSurfaceArea() {
        return 2 * (this.length * this.height + this.height * this.width + this.width * this.length);
    }

    public void initiateShadows(boolean isNight) {
        if(isNight) {
            System.out.println("No Shadows..");
        }else  {
            System.out.println("Render Shadows..");
        }
    }

    // GIVE PEOPLE WHO USE YOUR CODE SOME CONFIGURABILITY / FREEDOM
    // ENFORCING A STANDARD
    public abstract String renderShadowOnObject(String wall);
}
