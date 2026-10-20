package poo.arrays_objects.even_numbers.src.program;

import java.util.Locale;
import java.util.Scanner;

import poo.arrays_objects.even_numbers.src.numberlist.NumberList;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        NumberList list = new NumberList(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            int number = sc.nextInt();
            list.setNumber(i, number);
        }

        System.out.println("Even numbers in the list:");
        list.showEvenNumbers();
        list.countEvenNumbers();

        sc.close();
    }
    
}
