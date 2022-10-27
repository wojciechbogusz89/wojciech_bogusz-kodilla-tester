package com.kodilla.inheritance;

public class Applications {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLight();

        Convertible convertible = new Convertible(4, 2);
        convertible.displaNumbersOfSeats();


    }
}
