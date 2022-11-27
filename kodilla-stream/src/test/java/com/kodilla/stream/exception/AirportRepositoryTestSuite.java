package com.kodilla.stream.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException{
        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        assertTrue(isWarsawInUse);
    }

}