package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    private ApplicationContext context;
    private Display display;
    private Calculator calculator;

    @BeforeEach
    public void setUpApplicationContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        display = context.getBean(Display.class);
        calculator = context.getBean(Calculator.class);
    }

    @Test
    void add(){
        Assertions.assertEquals(3, calculator.add(1,2));
    }
    @Test
    void subtract() {
        Assertions.assertEquals(1, calculator.substract(2,1));
    }
    @Test
    void multiply (){
        Assertions.assertEquals(2, calculator.multiply(2,1));
    }
    @Test
    void divide () {
        Assertions.assertEquals(2, calculator.divide(2,1));
    }
}
