package entities;

public class Account {

    private int accountNumber; // número da conta
    private String holder; // nome do titular da conta
    private double balance; // saldo da conta

    
   
     public Account(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = 0.0; // saldo inicial é zero
    }

    public  int getAccountNumber() {
        return accountNumber;
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
   

    public void deposit(double amount) {
        balance += amount; // adiciona o valor ao saldo
    }

    
    
}
