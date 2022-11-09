package com.kodilla.collections.interfaces;

import java.util.Objects;

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
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public void deacreseSpeed() {
        speed += -15;



    }
}
