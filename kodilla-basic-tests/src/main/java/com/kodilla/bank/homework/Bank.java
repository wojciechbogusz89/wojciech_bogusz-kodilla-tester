package com.kodilla.bank.homework;

public class Bank {


        private CashMachine[] cashMachines = new CashMachine[0];

        private int size = 0;



        public void addCashMachine(CashMachine cashMachine) {
            this.size++;
            CashMachine[] cashMachines1 = new CashMachine[this.size];
            System.arraycopy(cashMachines, 0, cashMachines1, 0, cashMachines.length);
            cashMachines1[this.size - 1] = cashMachine;
            this.cashMachines = cashMachines1;

        }


        public int getTotalBalance() {
            int sum = 0;
            for (CashMachine cashMachine : cashMachines) {
                sum += cashMachine.getBalance();
            }
            return sum;
        }

        public int getTotalNumberOfDeposits() {
            int sum = 0;
            for (CashMachine cashMachine : cashMachines) {
                sum += cashMachine.getNumberOfDeposits();
            }
            return sum;
        }

        public int getTotalNumberOfWithdraws() {
            int sum = 0;
            for (CashMachine cashMachine : cashMachines) {
                sum += cashMachine.getNumberOfWithdraws();

            }
            return  sum;
        }

        public double getTotalAverageOfDeposits() {
            double avgDeposit = (this.cashMachine1.getSumOfDeposits() + this.cashMachine2.getSumOfDeposits() + this.cashMachine3.getSumOfDeposits()) / (this.cashMachine1.getNumberOfDeposits() + this.cashMachine2.getNumberOfDeposits() + this.cashMachine3.getNumberOfDeposits());
            return avgDeposit;
        }

        public double getTotalAverageOfWithdraws() {
            double avgWithdraw = (this.cashMachine1.getSumOfWithdraws() + this.cashMachine2.getSumOfWithdraws() + this.cashMachine3.getSumOfWithdraws()) / (this.cashMachine1.getNumberOfWithdraws() + this.cashMachine2.getNumberOfWithdraws() + this.cashMachine3.getNumberOfWithdraws());
            return avgWithdraw;
        }
}
