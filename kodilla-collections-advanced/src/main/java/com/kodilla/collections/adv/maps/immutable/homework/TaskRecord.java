package com.kodilla.collections.adv.maps.immutable.homework;

public record TaskRecord(String title, int duration, int ilosc) {
    static TaskRecord taskRecord = new TaskRecord("mnozenie", 25, 3);

}
