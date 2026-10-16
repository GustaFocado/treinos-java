package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    

        System.out.println("Create an account: ");
        System.out.print("Create acount name:  ");
        String name = sc.nextLine();
        System.out.print("Create account number: ");
        int accountNumber = sc.nextInt();

       System.out.print("Do you want to make an initial deposit? (y/n): ");
       char response = sc.next().charAt(0);

        Account account;

        sc.close();


        if (response == 'y' || response == 'Y') {
            System.out.print("Enter the initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
           account = new Account(accountNumber, name, initialDeposit);

} else {
    
    account = new Account(accountNumber, name);
}

        System.out.println("Account created successfully!");
        System.out.println("Account holder: " + account.getHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("balance: " + account.getBalance());

        int option;

do {
    System.out.println();
    System.out.println("1 - Deposit");
    System.out.println("2 - Withdraw");
    System.out.println("3 - Exit");

    option = sc.nextInt();

    if (option == 1) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("Updated balance: " + account.getBalance());

    } else if (option == 2) {
        System.out.print("Enter withdraw amount: ");
        double amount = sc.nextDouble();

        account.withdraw(amount);

        System.out.println("Updated balance: " + account.getBalance());

    } else if (option == 3) {
        System.out.println("Closing account menu...");
    } else {
        System.out.println("Invalid option.");
    }

} while (option != 3);

sc.close();
    }

    

    



    
}
