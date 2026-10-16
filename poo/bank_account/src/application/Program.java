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
        System.out.println("Enter initial deposit amount: ");
        double initialDeposit = sc.nextDouble();
        System.out.println("Do you want to make an initial deposit? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter the initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
        } else {
            double initialDeposit = 0.0;
        }

        Account account = new Account(accountNumber, name, initialDeposit);

        System.out.println("Account created successfully!");
        System.out.println("Account holder: " + account.getHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("balance: " + account.getBalance());
    }


    
}
