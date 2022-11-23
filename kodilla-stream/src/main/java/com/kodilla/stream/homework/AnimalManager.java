package com.kodilla.stream.homework;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalManager {
    public static void main(String[] args) {
        List<String> SsakGroupAnimalKind = filterSsakGroupAnimalKind(100);
        System.out.println(SsakGroupAnimalKind);

    }
    public static List<String> filterSsakGroupAnimalKind(int weight){
        List<String> kind = AnimalRepository.getAnimalList()
                .stream()
                .filter(animal -> animal.getGroup().equals("ssak"))
                .filter(animal -> animal.getWeight()>weight)
                .map(AnimalManager :: getAnimalKind)
                .collect(Collectors.toList());

        return kind;

    }
    public static String getAnimalKind (Animal animal){
        return animal.getKind();

    }
    public static int getAnimalWeight (Animal animal){
        return animal.getWeight();
    }

}
