package com.kodilla.collections.adv.maps.immutable;

public record BookRecord(String author, String Title, int Year) {
    static BookRecord bookRecord = new BookRecord("test", "testowa pozycja,", 2022);
}
