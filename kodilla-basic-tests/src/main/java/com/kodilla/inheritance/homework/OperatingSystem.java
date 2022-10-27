package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseDate;
    private int supportEnd;


    public OperatingSystem(int releaseDate, int supportEnd) {
        this.releaseDate = releaseDate;
        this.supportEnd = supportEnd;


    }

    public void turnOn() {
        System.out.println("System has beem turned on");
    }

    public void turnOff() {
        System.out.println("System has been turned off");
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getSupportEnd() {
        return supportEnd;
    }

    public void displaYearofrealesed() {
        System.out.println("System has been released in" + " " + releaseDate);
    }

    public void displaYearOfEndSupport() {
        System.out.println("System has been released in" + " " + supportEnd);
    }
}



