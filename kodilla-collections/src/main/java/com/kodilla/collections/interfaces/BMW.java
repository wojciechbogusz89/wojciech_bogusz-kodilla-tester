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
    public void increaseSpeed() {
         speed += 20;

    }

    @Override
    public void deacreseSpeed() {
        speed += -15;


    }
}
