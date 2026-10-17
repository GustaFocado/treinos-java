package poo.arrays_objects.numberlist.src.program;

import java.util.Locale;
import java.util.Scanner;

import poo.arrays_objects.numberlist.src.number.NumberList;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        NumberList numberList = new NumberList(n);

        for (int i = 0; i < numberList.size; i++) {
            System.out.println("Enter the value for position " + i + ": ");
            int value = sc.nextInt();
            numberList.setNumber(i, value);
        }


        System.out.println("Negative numbers in the list:");
        numberList.showNegativeNumbers();
        sc.close();
    }

}
