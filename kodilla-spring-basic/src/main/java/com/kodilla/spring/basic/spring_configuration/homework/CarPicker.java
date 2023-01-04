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
        if ((MonthDay.now().isAfter(MonthDay.of(3, 20))
                && MonthDay.now().isBefore(MonthDay.of(6, 20)))
                || (MonthDay.now().isAfter(MonthDay.of(8, 20))
                && MonthDay.now().isBefore(MonthDay.of(12, 20)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(12, 20))
                && MonthDay.now().isBefore(MonthDay.of(3, 20))) {
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}