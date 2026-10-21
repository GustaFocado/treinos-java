package poo.lists.employee_salary.src.program;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import poo.lists.employee_salary.src.entities.Employee;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, salary and id of employee " + (i + 1) + ":");
            String name = sc.next();
            double salary = sc.nextDouble();
            int id = sc.nextInt();

            boolean idExists = false;
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    idExists = true;
                    break;
                }
            }

            if (!idExists) {
                employees.add(new Employee(name, salary, id));
            }
        }

        System.out.println("Enter the id of the employee to increase salary:");
            int id = sc.nextInt();
            boolean found = false;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Enter the percentage increase for employee " + employee.getName() + ":");
                double percentage = sc.nextDouble();
                employee.increaseSalary(percentage);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Salary increased successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();

    }
}
