package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.Audi;
import com.kodilla.collections.interfaces.BMW;
import com.kodilla.collections.interfaces.Car;
import com.kodilla.collections.interfaces.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi(50));
        cars.add(new BMW(60));
        cars.add(new Mercedes(70));

        cars.remove(1);
        Audi audi = new Audi(50);
        cars.remove(audi);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + " " +  car.getSpeed());


        }

    }
}
