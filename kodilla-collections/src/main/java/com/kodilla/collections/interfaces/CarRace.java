package com.kodilla.collections.interfaces;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(100);
        doRace(audi);
        BMW bmw = new BMW(110);
        doRace(bmw);
        Mercedes mercedes = new Mercedes(100);
        doRace(mercedes);

        }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.deacreseSpeed();
        car.deacreseSpeed();
        System.out.println(car.getSpeed());
    }
}





