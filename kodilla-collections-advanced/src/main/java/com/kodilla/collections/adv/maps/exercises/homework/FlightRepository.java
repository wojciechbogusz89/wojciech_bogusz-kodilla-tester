package com.kodilla.collections.adv.maps.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", "Poznan"));
        flightList.add(new Flight("Poznan", "Frankfurt"));
        flightList.add(new Flight("Frankfurt", "Lizbona"));
        flightList.add(new Flight("Lizbona", "Zurych"));
        flightList.add(new Flight("Zurych", "Berlin"));
        flightList.add(new Flight("Berlin", "Paryz"));
        flightList.add(new Flight("Paryz", "Warszawa"));
        return flightList;

    }
}
