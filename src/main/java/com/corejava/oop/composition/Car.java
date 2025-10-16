package com.corejava.oop.composition;

//CAR IS-A VEHICLE
public class Car extends Vehicle {
    private Chassis chassis; // HAS-A
    private Transmission transmission; // HAS-A
    private Engine engine; // HAS-A

    public void setChassis(Chassis chassis1) {
        this.chassis = chassis1;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chassis getChassis() {
        return this.chassis;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public String toString() {
        System.out.println("=========== CAR =============");
        return "Transmission : "+this.transmission+" Engine : "+this.engine+" Chassis : "+this.chassis;
    }

    public static void main(String[] args) {
        Car tataSumo = new Car();

        Chassis ladderOnFrame = new Chassis();
        ladderOnFrame.setMaterial("steel");
        ladderOnFrame.setPlatform("CBU");
        ladderOnFrame.setChassisType("Ladder");

        Transmission manualTrans = new Transmission();
        manualTrans.setManufacturer("Fiat");
        manualTrans.setType("Manual");
        manualTrans.setNumGears(4);

        Engine mhawk = new Engine();
        mhawk.setDisplacement(1500);
        mhawk.setEngineMake("Fiat");
        mhawk.setMaxTorque(90);

        tataSumo.setChassis(ladderOnFrame);
        tataSumo.setTransmission(manualTrans);
        tataSumo.setEngine(mhawk);
        System.out.println(tataSumo);

        tataSumo.setBrand("TATA");
        tataSumo.setType("SUV");

        tataSumo.start();
        int gearNum = tataSumo.getTransmission().getGearAsPerSpeed(83);
        System.out.println("Selected Gear "+gearNum+" as per provided speed");
        tataSumo.stop();
    }
}
