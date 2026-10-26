package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income:");
            double anualIncome = sc.nextDouble();

            if ( type == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
                
            }
            else {
                System.out.print("Number of employees ");
                int employees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, employees));

            }
        }

        System.out.println("TAXES PAID: ");

        double totalTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            double tax = taxPayer.tax();
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), tax);
            totalTaxes += tax;
        }

        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);

        sc.close();
    }
    
}
