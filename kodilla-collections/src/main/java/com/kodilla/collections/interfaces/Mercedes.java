package com.kodilla.collections.interfaces;

public class Mercedes implements Car {
    int speed;

    public Mercedes(int speed) {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public int increaseSpeed() {
        return speed+ 10;

    }

    @Override
    public int deacreseSpeed() {
        return speed - 10;


    }
}
