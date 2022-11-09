package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "BMW{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return speed == bmw.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
