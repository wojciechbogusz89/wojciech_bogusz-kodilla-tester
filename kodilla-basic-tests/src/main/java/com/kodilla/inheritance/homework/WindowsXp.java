package com.kodilla.inheritance.homework;

public class WindowsXp extends Windows {
    public WindowsXp(int relaeseDate, int supportEnd) {
        super(relaeseDate, supportEnd);
    }

    public void wallpaper() {
        System.out.println("System has wonderfull wallpaper");
    }
}
