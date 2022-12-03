package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Datas {
    static Stream<Arguments> provideDataForBmiCalculator() {
        return Stream.of(
                Arguments.of(1.60, 60, "Normal (healthy weight)"),
                Arguments.of(1.60, 180, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.70, 35, "Very severely underweight")
        );
    }
}
