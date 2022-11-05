package com.kodilla.collections.interfaces;

import java.util.concurrent.TransferQueue;

public class Triangle implements Shape{
    double width;
    double height;
    double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;

    }

    @Override
    public double getArea() {
        return width * height/2;
    }

    @Override
    public double getPerimeter() {
        return width + hypotenuse + height;
    }
}
