package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.*;

import java.util.Random;

public class CarApplication {
    public static  Car opiszCar (){
            Random random = new Random();
            int opiszCarBrand = random.nextInt(3);
            double a = getRandomBrand(random);
            if (opiszCarBrand== 0)
                return new Audi(4);

            else if (opiszCarBrand== 1)
                return new BMW(10 );
            else {
                return new Mercedes(6);
            }
    }
    private static double getRandomBrand(Random random) {
        return random.nextDouble() * 100 + 1;
    }

    public static void main(String[] args) {
        Car [] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = opiszCar();
        for (Car car : cars)
            CarUtils.displayCar(car);



    }

}
