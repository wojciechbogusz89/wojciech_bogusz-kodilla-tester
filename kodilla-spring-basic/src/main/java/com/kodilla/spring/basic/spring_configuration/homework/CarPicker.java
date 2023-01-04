package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

@Configuration
public class CarPicker {

    @Bean
    public Car dependsOfSeason() {
        Car car;
        if ((MonthDay.now().isAfter(MonthDay.of(4, 1))
                && MonthDay.now().isBefore(MonthDay.of(5, 30)))
                || (MonthDay.now().isAfter(MonthDay.of(9, 1))
                && MonthDay.now().isBefore(MonthDay.of(11, 30)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(12, 1))
                && MonthDay.now().isBefore(MonthDay.of(3, 31))) {
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}