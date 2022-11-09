package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("kon", 1997, "tak"));
        stamps.add(new Stamp("zaba", 2004, "nie"));
        stamps.add(new Stamp("pies", 1889, "nie"));
        stamps.add(new Stamp("kon", 1997, "tak"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);



    }
}
