package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

    public static void main(String[] args) {


          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          Employee emp = new Employee();

          System.out.println("Enter employee data: ");
            System.out.print("Name: ");
            emp.name = sc.nextLine();
            System.out.print("Gross salary: ");
            emp.grossSalary = sc.nextDouble();
            System.out.print("Tax: ");
            emp.tax = sc.nextDouble();
            
            sc.close();

    }

}