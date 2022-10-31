package com.kodilla.abstracts.homework;

public class rectangle extends Shape{
    public rectangle(double a, double b){
        super.bokA = a;
        super.bokB = b;

    }
    double surfaceArea() {
        return bokA * bokB;

    }

    double circuit() {
        return bokB + bokB + bokA + bokB;
    }
}
