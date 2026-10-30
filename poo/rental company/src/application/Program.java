package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        dateFormat.setLenient(false);

        System.out.print("Enter the rental details. ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Rental start date (dd/MM/yyyy HH:mm): ");
        Date rentalStart = dateFormat.parse(sc.nextLine());
        System.out.print("Rental end date (dd/MM/yyyy HH:mm): ");
        Date rentalEnd = dateFormat.parse(sc.nextLine());
        System.out.println("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        CarRental carRental = new CarRental(
                rentalStart,
                rentalEnd,
                pricePerDay,
                pricePerHour
        );

        System.out.println();
        System.out.println("Car: " + carModel);
        System.out.println("Rental start: " + dateFormat.format(rentalStart));
        System.out.println("Rental end: " + dateFormat.format(rentalEnd));
        System.out.printf("Price per hour: %.2f%n", pricePerHour);
        System.out.printf("Price per day: %.2f%n", pricePerDay);
        System.out.printf("Total price: %.2f%n", carRental.calculateTotalPrice());

        sc.close();

    }
}
