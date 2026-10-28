package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    try {
    System.out.print("Enter account data: ");
    System.out.print("Number: ");
    int number = sc.nextInt();

    System.out.print("Holder: ");
    String holder = sc.next();

    System.out.print("Initial balance: ");
    double balance = sc.nextDouble();

    System.out.print("Withdraw limit: ");
    double withdrawLimit = sc.nextDouble();

    Account account =
        new Account(number, holder, balance, withdrawLimit);

    System.out.print("Enter amount for withdraw: ");
    double value = sc.nextDouble();

    account.withdraw(value);

    System.out.printf("New balance: %.2f%n", account.getBalance());
    sc.close();

} catch (DomainException e) {
    System.out.println("Error: " + e.getMessage());
}
    }

}
