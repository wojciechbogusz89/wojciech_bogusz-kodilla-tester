package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] values;
    private int size;


    public Bank() {
        this.values = new CashMachine[0];
        this.size = 0;
    }


    public double getBalance() {
        int sum = 0;
        for (CashMachine bankomat : values) {
            sum += bankomat.getBalance();
        }
        return sum;
    }

    public void add(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int getNumberOfIncomes() {
        int incomes = 0;
        for (CashMachine bankomat : values) {
            incomes += bankomat.getNumberIncomes();
        }
        return incomes;
    }
    public int getSumOfIncomes(){
        int sumIncomes = 0;
        for (CashMachine bankomat : values){
            sumIncomes += bankomat.getSumIncomes();
        }
        return sumIncomes;
    }

    public int getNumberOfWithdraws() {
        int withdraws = 0;
        for (CashMachine bankomat : values) {
            withdraws += bankomat.getNumberWithdraws();
        }
        return withdraws;
    }

    public int getSumOfWithdraws(){
        int sumWithdraws = 0;
        for (CashMachine bankomat : values){
            sumWithdraws += bankomat.getSumWithdraws();
        }
        return sumWithdraws;
    }


    public double averageOfIncomes() {
        return getSumOfIncomes()/(double)getNumberOfIncomes();
    }
    public double averageOfWithdraws() {
        return getSumOfWithdraws()/(double)getNumberOfWithdraws();
    }


}

