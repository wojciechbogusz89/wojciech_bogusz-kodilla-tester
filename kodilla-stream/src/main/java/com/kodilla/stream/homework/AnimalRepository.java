package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    public static List<Animal> getAnimalList(){
        List<Animal>animals = new ArrayList<>();
        animals.add(new Animal("Zajac", 4, "grey", "ssak"));
        animals.add(new Animal("Zaba",  1, "Green", "plaz"));
        animals.add(new Animal("Kon", 150, "brown", "ssak"));
        animals.add(new Animal("pies", 20, "rozny", "ssak"));
        animals.add(new Animal("tunczyk", 30, "niebieski", "ryba"));
        animals.add(new Animal("krowa", 400, "bialy", "ssak"));
        return animals;
    }
}
