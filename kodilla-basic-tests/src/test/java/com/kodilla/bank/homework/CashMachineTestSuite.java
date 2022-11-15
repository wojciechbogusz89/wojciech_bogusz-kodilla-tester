package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        int[] values = cashMachine.getOperations();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(100);
        cashMachine.addOperation(-50);

        int[] values = cashMachine.getOperations();
        assertEquals(2, values.length);
        assertEquals(100, values[0]);
        assertEquals(-50, values[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-100);

        int balance = cashMachine.getBalance();
        assertEquals(200, balance);
    }

    @Test
    public void shouldReturnNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-100);

        int deposits = cashMachine.getNumberOfDeposits();
        assertEquals(2, deposits);
    }

    @Test
    public void shouldReturnNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);
        cashMachine.addOperation(-50);

        int withdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(2, withdraws);
    }

    @Test
    public void shouldCalculateAverageOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(100);
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);

        double avgDeposits = cashMachine.getAverageOfDeposits();
        assertEquals(150, avgDeposits);
    }

    @Test
    public void shouldCalculateAverageOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(200);
        cashMachine.addOperation(-100);
        cashMachine.addOperation(-50);

        double avgWithdraws = cashMachine.getAverageOfWithdraws();
        assertEquals(-75, avgWithdraws);
    }


}