package com.kodilla.collections.interfaces;

public class BMW implements Car {

    int speed;

    public BMW(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + 20;

    }

    @Override
    public int deacreseSpeed() {
        return speed - 15;


    }
}
