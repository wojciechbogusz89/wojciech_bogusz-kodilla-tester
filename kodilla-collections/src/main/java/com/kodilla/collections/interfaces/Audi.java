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
    public void increaseSpeed() {
        speed +=  15;

    }

    @Override
    public void deacreseSpeed() {
        speed += -15;



    }
}
