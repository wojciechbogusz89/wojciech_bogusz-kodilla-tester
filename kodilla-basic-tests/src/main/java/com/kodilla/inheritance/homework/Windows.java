package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows (int releaseDate, int supportEnd) {
        super(releaseDate, supportEnd);

    }

    public void greatFonts() {
        System.out.println("System has new geats fonts");
    }


}
