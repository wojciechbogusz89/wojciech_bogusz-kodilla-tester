package com.kodilla.collections.adv.maps.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> szkola = new HashMap<>();


        Principal jan = new Principal("jan", "kowalski");
        Principal zbigniew = new Principal("zbigniew", "oko");
        Principal mirek = new Principal("mirek", "nowak");



        School janSchool = new School(Arrays.asList(20.0, 30.0, 20.0, 10.0));
        School zbigniewSchool = new School(Arrays.asList(14.0, 15.0, 20.0, 10.0));
        School mirekSchool = new School(Arrays.asList(15.0, 20.0, 10.0, 20.0));

        szkola.put(jan, janSchool);
        szkola.put(zbigniew, zbigniewSchool);
        szkola.put(mirek, mirekSchool);




        for (Map.Entry<Principal, School> principalEntry : szkola.entrySet()){
            System.out.println(principalEntry.getKey().getFirstName() + "liczba uczniow w szkole " + principalEntry.getValue().getSum());
        }






    }
}
