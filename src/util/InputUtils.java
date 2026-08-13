package util;

import model.entities.Product;
import services.StockService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    public static final int INVALID_OPTION = -1;

    public static List<Product> products = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);

    public static void askProduct(){
        System.out.print("Enter the product: (name, price, quantity) ");
        String[] fields = sc.nextLine().trim().split(",");

        if (fields.length != 3) {
            System.out.println("Invalid format. Use: name, price, quantity!");
            return;
        }

        String name = fields[0];

        try {
            double price = Double.parseDouble(fields[1].trim());
            int quantity = Integer.parseInt(fields[2].trim());

            products.add(new Product(name, price, quantity));
            StockService.addProduct();
        } catch (NumberFormatException e) {
            System.out.println(("Invalid number format. Price and quantity must be valid numbers."));
        }
    }

    public static int readOption() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, enter only numbers!");
            return INVALID_OPTION;
        }
    }

    public static void close() {
        sc.close();
    }
}
