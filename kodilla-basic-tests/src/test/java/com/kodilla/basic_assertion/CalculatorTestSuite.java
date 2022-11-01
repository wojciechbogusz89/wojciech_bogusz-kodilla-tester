package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResults = calculator.substract(a,b);
        assertEquals(-3, substractResults);
    }
    @Test
    public void testPotega() {
        Calculator calculator = new Calculator();
        int a = 5;
        int potegaResults = calculator.potega(a);
        assertEquals(25, potegaResults);
    }
}
