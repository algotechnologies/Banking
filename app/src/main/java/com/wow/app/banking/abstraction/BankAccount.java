package com.wow.app.banking.abstraction;


// This class won't instantiate
public abstract class BankAccount {

    private String accountTitle = "";
    private double accountBalance = 0;
    private int accountNumber;

    // Make deposit in account
    public BankAccount deposit(double amount) {
        this.accountBalance += amount;
        return this;
    }

    // Cash withdrawl from account
    public BankAccount withdrawl(double amount) {
        this.accountBalance -= amount;
        return this;
    }

    // Open a fresh bank account
    public boolean open(String accountTitle, int accountNumber) {
        this.accountTitle = accountTitle;
        this.accountNumber = accountNumber;
        // We can also return String here instead of boolean saying 'Account has been opened successfully'
        return true;
    }

    // Close already opened bank account
    public boolean close(int accountNumber) {
        // Closing an account logic will be defined here
        // We can also return String here instead of boolean saying 'Account has been closed successfully'
        return true;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
