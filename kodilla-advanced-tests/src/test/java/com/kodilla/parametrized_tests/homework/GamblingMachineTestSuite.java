package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineCorrect", numLinesToSkip = 1)

    public void howManyWins_ReturnWins(String number1) throws InvalidNumbersException {
        Set<Integer> numbers = convert(number1);



        int result = GamblingMachine.howManyWins(numbers);

        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachjineWrongNumbers", numLinesToSkip = 1)

    public void howManyWins_ReturnLose(String number1) throws InvalidNumbersException {
        Set<Integer> numbers = convert(number1);






        assertThrows(InvalidNumbersException.class, () -> GamblingMachine.howManyWins(numbers));

    }

    public Set<Integer> convert(String input) {
        Set<Integer> numbers = new HashSet<>();
        for (String s : input.split(",")) {
            int Zmienna = Integer.parseInt(s);
            numbers.add(Zmienna);

        }
        return numbers;
    }

}