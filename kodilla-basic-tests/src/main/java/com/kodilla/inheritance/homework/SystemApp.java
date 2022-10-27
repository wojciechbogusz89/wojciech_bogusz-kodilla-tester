package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1998, 2007);
        operatingSystem.turnOn();

        Windows windows = new Windows(2004,2009);
        windows.greatFonts();

        WindowsXp windowsXp = new WindowsXp(2010, 2020);
        windows.displaYearOfEndSupport();

    }


}
