package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Audi;
import com.kodilla.collections.interfaces.BMW;
import com.kodilla.collections.interfaces.Car;
import com.kodilla.collections.interfaces.Mercedes;

public class        CarUtils {
    public static void displayCar (Car car) {
        System.out.println("---------------------");
        System.out.println("Car Brand" + getCarBrand(car));
        System.out.println("Car speed" + car.getSpeed());
     ;


    }

    private static String getCarBrand(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else
            return "Unknown brand name";}


}
