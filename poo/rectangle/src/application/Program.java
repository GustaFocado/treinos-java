package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.width = width;
        r.height = height;

        System.out.printf("Area: %.2f%n", r.area());
        System.out.printf("Perimeter: %.2f%n", r.perimeter());
        System.out.printf("Diagonal: %.2f%n", r.diagonal());
        sc.close();

    }
    
}
