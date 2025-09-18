package com.corejava.oop;

public class Phone {
    String make;
    String model;
    float screenSize;
    int ramCapacity;
    String os;
    String cameraInMp;

    public void bootUp(String logo) {
        System.out.println(this.make+ " : "+this.model + " is booting up with logo "+logo);
    }

    public void shutDown() {
        if(this.make.equalsIgnoreCase("SAMSUNG")) {
            System.out.println("shutting down...");
            System.out.println("......");
            System.out.println("..........");
            System.out.println("bye!");
        }else  {
            System.out.println("Thanks for using apple ecosystem");
            System.out.println("bye");
        }
    }

    public void makeCalls(String number) {
        if(this.make.equalsIgnoreCase("APPLE")) {
            System.out.println("Calling "+number+" with iOS Dialer..");
        } else if(this.make.equalsIgnoreCase("SAMSUNG")){
            System.out.println("Dialing "+number+ "With Android dialer..");
        }else {
            System.out.println("Calling "+number);
        }
    }

    public static void main(String[] args) {
        Phone galaxyPhone = new Phone();
        galaxyPhone.make = "Samsung";
        galaxyPhone.model = "S21";
        galaxyPhone.screenSize = 6.5f;
        galaxyPhone.ramCapacity = 12;
        galaxyPhone.os = "Android";
        galaxyPhone.bootUp("Samsung Logo");
        galaxyPhone.makeCalls("782848377");
        galaxyPhone.shutDown();

        Phone iphone16 = new Phone();
        iphone16.make = "apple";
        iphone16.model = "iphone16";
        iphone16.screenSize = 6.0f;
        iphone16.ramCapacity = 6;
        iphone16.os = "iOS";
        iphone16.bootUp("Apple Logo");
        iphone16.makeCalls("6363327432");
        iphone16.shutDown();

    }
}
