package poo.arrays_objects.vector_sum.src.program;

import java.util.Locale;
import java.util.Scanner;

import poo.arrays_objects.vector_sum.src.numberlist.Numberlist;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        Numberlist numberlist = new Numberlist(n);

        for (int i = 0; i < numberlist.size(); i++) {
            System.out.println("Enter the value for position " + i + ": ");
            double value = sc.nextDouble();
            numberlist.setNumber(i, value);
        }

        System.out.println("Sum: " + numberlist.sum());
        System.out.println("Average: " + numberlist.average());
        System.out.println("Numbers: " + numberlist.toString());
        sc.close();
    }

}
