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

    public static void enterProduct(){
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

    public static void inputProductName(){
        System.out.println("Enter the product name: ");
        StockService.removeProduct(sc.nextLine().trim());
    }

    public static int readOption() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, enter only numbers!");
            return INVALID_OPTION;
        }
    }

    public static Boolean antDumb() {

        System.out.print("You really want to reset the warehouse? (Y/N) ");
        char opt = Character.toUpperCase(sc.next().charAt(0));

        if (opt == 'Y') {
            System.out.print("You're sure? ");
            opt = Character.toUpperCase(sc.next().charAt(0));
            if (opt == 'Y') {
                sc.nextLine();
                return true;
            }
            else {
                sc.nextLine();
                return false;
            }
        }
        sc.nextLine();
        return false;
    }

    public static void close() {
        sc.close();
    }
}
