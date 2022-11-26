package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {
    @Test
    public void shouldCalculateBalance() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();

        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(1000);
        bank.add(cashMachine);
        bank.add(cashMachine1);
        double balance = bank.getBalance();
        Assertions.assertEquals(1030, balance, 0.01);

    }

    @Test
    public void shouldCalculateNumberOfIncomes() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();

        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(1000);
        bank.add(cashMachine);
        bank.add(cashMachine1);
        int incomes = bank.getNumberOfIncomes();
        Assertions.assertEquals(2, incomes);
    }

    @Test
    public void shouldCalculateNumberOfWithdraws() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();

        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(1000);
        bank.add(cashMachine);
        bank.add(cashMachine1);
        int withdraws = bank.getNumberOfWithdraws();
        Assertions.assertEquals(2, withdraws);
    }

    @Test
    public void shouldCalculateAverageOfIncomes() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(1000);
        bank.add(cashMachine);
        bank.add(cashMachine1);

        Assertions.assertEquals(550, bank.averageOfIncomes());
    }

    @Test
    public void shouldCalculateAverageOfWithdraws() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(1000);
        bank.add(cashMachine);
        bank.add(cashMachine1);

        Assertions.assertEquals(35, bank.averageOfWithdraws());
    }
}



