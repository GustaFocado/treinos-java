package model.entities;

import model.exceptions.DomainException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit ;


    public Account(int number, String holder, double balance, double withdrawLimit) {
            if (number <= 0) {
        throw new DomainException("Account number must be positive");
    }

    if (holder == null || holder.isBlank()) {
        throw new DomainException("Holder is required");
    }

    if (balance < 0.0) {
        throw new DomainException("Initial balance cannot be negative");
    }

    if (withdrawLimit <= 0.0) {
        throw new DomainException("Withdraw limit must be greater than zero");
    }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        if (amount <= 0.0) {
            throw new DomainException("The deposit amount must be greater than zero");
        }

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0.0) {
            throw new DomainException("The withdrawal amount must be greater than zero");
        }
        if (amount > withdrawLimit) {
            throw new DomainException("The withdrawal amount exceeds the withdrawal limit");
        }
        if (amount > balance) {
            throw new DomainException("The withdrawal amount exceeds the account balance");
        }

        this.balance -= amount;
    }
}
