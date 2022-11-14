package com.kodilla.collections.adv.maps.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("Warszawa", "Poznan"));
        flightList.add(new Flight("Poznan", "Frankfurt"));
        flightList.add(new Flight("Frankfurt", "Lizbona"));

        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Poznan"));
        assertEquals(expectedList, result);

    }

    public void testFindFlightsTo(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("Lizbona", "Zurych"));
        flightList.add(new Flight("Zurych", "Berlin"));
        flightList.add(new Flight("Berlin", "Paryz"));

        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Zurych", "Berlin"));
        assertEquals(expectedList, result);
    }
}

