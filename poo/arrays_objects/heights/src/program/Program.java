package poo.arrays_objects.heights.src.program;

import java.util.Locale;
import java.util.Scanner;

import poo.arrays_objects.heights.src.entities.Person;
import poo.arrays_objects.heights.src.entities.PersonGroup;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        PersonGroup group = new PersonGroup(n);
    }
    
}
