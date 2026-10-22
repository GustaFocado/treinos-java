package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static LocalDate readDate(Scanner sc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(sc.next(), formatter);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: " );
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = readDate(sc);

        Client client = new Client(name, email, birthDate);

        System.out.println("-------------------------------------------------------");
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), null);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter # " + (i+1) + " item data: " );
            System.out.print("Product name: ");
            String product = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product itemProduct = new Product(product, price);
            order.addItem(new OrderItem(quantity, price, itemProduct));
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getDateofTheOrder());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() + " (" + client.getEmail() + ")");
        System.out.println("Birth date: " + client.getBirthDate());
        System.out.println("Order items:");

        for (OrderItem item : order.getItems()) {
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n",
                    item.getProduct().getName(), item.getPrice(), item.getQuantity(), item.subTotal());
        }

        System.out.printf("Total price: $%.2f%n", order.total());

        sc.close();
    }
}
