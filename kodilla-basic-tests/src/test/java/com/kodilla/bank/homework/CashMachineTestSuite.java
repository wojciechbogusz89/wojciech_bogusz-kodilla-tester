package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {
    @Test
    public void length() {
        CashMachine cashMachine = new CashMachine();

        int[] values = cashMachine.getOperations();
        assertEquals(0, values.length);
    }

    @Test
    public void elementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(100);
        cashMachine.addOperation(-50);

        int[] values = cashMachine.getOperations();
        assertEquals(2, values.length);
        assertEquals(100, values[0]);
        assertEquals(-50, values[1]);
    }

    @Test
    public void calculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-100);

        int balance = cashMachine.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void returnNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-100);

        int deposits = cashMachine.getNumberOfDeposits();
        assertEquals(2, deposits);
    }

    @Test
    public void returnNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);
        cashMachine.addOperation(-50);

        int withdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(2, withdraws);
    }

    @Test
    public void calculateAverageOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(100);
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);

        double avgDeposits = cashMachine.getAverageOfDeposits();
        assertEquals(150, avgDeposits);
    }

    @Test
    public void calculateAverageOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);
        cashMachine.addOperation(-50);

        double avgWithdraws = cashMachine.getAverageOfWithdraws();
        assertEquals(-75, avgWithdraws);
    }


}