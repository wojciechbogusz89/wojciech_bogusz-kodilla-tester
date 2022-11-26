package com.kodilla.bank.homework;

public class CashMachine {
    int[] transactions = new int[0];
    int transactionCount = 0;


    public CashMachine() {
    }

    public int getBalance(){
        int balance= 0;
        for (int tx: transactions){
            balance+=tx;

        }
        return balance;
    }

    public double getAverage() {
        return 0;
    }

    public int getNumberIncomes(){
        int incomes = 0;
        for (int tx : transactions) {
            if (tx > 0) {
                incomes++;
            }
        }
        return incomes;
    }
    public int getSumIncomes(){
        int incomes = 0;
        for (int tx : transactions) {
            if (tx > 0) {
                incomes+=tx;
            }
        }
        return incomes;
    }

    public double getAverageIncomes(){
        double value = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (i>0){
                value += this.transactions[i];
            }
        }
        return value;
    }
    public int getNumberWithdraws(){
        int withdraws = 0;
        for (int tx : transactions) {
            if (tx < 0) {
                withdraws++;
            }
        }
        return withdraws;

    }
    public int getSumWithdraws(){
        int sumWithdraws = 0;
        for (int tx : transactions) {
            if (tx < 0) {
                sumWithdraws+=tx;
            }
        }
        return sumWithdraws*-1;
    }

    public double getIncomesAverage() {
        return 0;
    }

    public void addTransaction(int incomes) {
        transactionCount++;
        int[] transactionList = new int[transactionCount];
        System.arraycopy(transactions, 0, transactionList, 0, transactions.length);
        transactionList[transactionCount - 1] = incomes;
        transactions = transactionList;
    }
}



