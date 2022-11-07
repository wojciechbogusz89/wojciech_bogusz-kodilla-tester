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
    public void increaseSpeed() {
        speed+= 10;

    }

    @Override
    public void deacreseSpeed() {
        speed += - 10;


    }
}
