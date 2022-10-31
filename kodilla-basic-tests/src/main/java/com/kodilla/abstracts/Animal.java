package com.kodilla.abstracts;

public abstract class Animal {
    private int numberssOfLegs;

    public Animal(int numberssOfLegs) {
        this.numberssOfLegs = numberssOfLegs;

    }
    public int getNumberssOfLegs() {
        return numberssOfLegs;

    }
    public abstract void giveVoice();


}
