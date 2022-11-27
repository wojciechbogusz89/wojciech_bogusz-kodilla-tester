package com.kodilla.stream.exception.homework;

public class Order {
    private String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return "Number" + number;

    }
}
