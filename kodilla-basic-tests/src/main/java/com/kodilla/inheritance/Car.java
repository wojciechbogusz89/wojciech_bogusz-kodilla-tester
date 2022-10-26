package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;

    }
    public Car() {
        System.out.println("car constructor");
    }

    public void turnOnLight() {
        System.out.println("lights were turned on");
    }
    public void openDoors() {
        System.out.println("Opening 4 doors");

    }
}
