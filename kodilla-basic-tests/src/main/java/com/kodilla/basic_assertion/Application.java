package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() ;
        int a = 5;
        int b = 8;
        int sumResults = calculator.sum(a, b);
        int substractResults = calculator.substract(a, b);
        int potegaResults = calculator.potega(a);
        boolean correct = ResultsChecker.assertEquals(13, sumResults);
        if(correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);

        }
        boolean corect = ResultsChecker.assertEquals(-3, substractResults);
        if(corect) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        }else  {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean korekt = ResultsChecker.assertEquals(25, potegaResults);
        if(korekt) {
            System.out.println("Metoda potega działa poprawnie dla liczb" + a);
        }else  {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a);

        }

    }
    }

