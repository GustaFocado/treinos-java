package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.ListOfProducts;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        ListOfProducts list = new ListOfProducts();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product product;
            if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(),
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product = new UsedProduct(name, price, manufactureDate);
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            } else {
                product = new Product(name, price);
            }

            list.addProduct(product);
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list.getProducts()) {
            System.out.println(product.priceTag());
        }

        sc.close();

    }

}
