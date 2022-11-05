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
        return + 10;

    }

    @Override
    public int deacreseSpeed() {
        return - 10;


    }
}
