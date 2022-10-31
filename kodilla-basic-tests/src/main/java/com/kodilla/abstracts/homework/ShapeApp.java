package com.kodilla.abstracts.homework;

import java.awt.*;

public class ShapeApp {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle= new Rectangle(2,4);
        Shape triangle = new Triangle(3,5);

        System.out.println("pole kwadratu" + " " + square.surfaceAreaSq() + " " + "a jego obwod wynosi" + " " + square.circuitSq());
        System.out.println("pole prostokata" + " " + rectangle.surfaceAreaRe() + " " + "a jego obwod wynosi" + " " + rectangle.circuitRe());
        System.out.println("pole trojkat" + " " + triangle.surfaceAreaTr() + " " + "a jego obwod wynosi" + " " + triangle.circuitTr());






    }
}
