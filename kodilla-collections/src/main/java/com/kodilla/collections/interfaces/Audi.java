package com.kodilla.collections.interfaces;

public class Audi implements Car {
    int speed;

    public Audi(int speed){
        this.speed = speed;

    }

    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public int increaseSpeed() {
        return + 15;

    }

    @Override
    public int deacreseSpeed() {
        return - 15;


    }
}
