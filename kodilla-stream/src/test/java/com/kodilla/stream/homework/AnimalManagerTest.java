package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalManagerTest {
    @Test
    public void testAnimal(){
        List<String>result = AnimalManager.filterSsakGroupAnimalKind(100);
        assertEquals(2,result.size());
    }

}