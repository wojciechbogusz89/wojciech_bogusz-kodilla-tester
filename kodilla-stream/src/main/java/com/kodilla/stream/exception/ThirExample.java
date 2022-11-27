package com.kodilla.stream.exception;

public class ThirExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna Status;  "  + isViennaInUse);

        } catch (AirportNotFoundException e) {
            System.out.println("Sorry this airport cannot be served by our airlines.");
        }
        System.out.println("Thank you for using Kodilla Airlines");

    }
}
