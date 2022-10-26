package com.kodilla.inheritance;

public class Convertible  extends Car {
    public Convertible(){
        System.out.println("Convertible Constructor");
    }
    public void openRoof() {
        System.out.println("opening roof...");
    }
    public void closeRoof() {
        System.out.println("closing roof...");
    }
    @Override
    public void openDoors() {
        System.out.println("open 2 doors");
    }

}
