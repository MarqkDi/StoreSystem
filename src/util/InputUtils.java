package util;

import model.entities.Product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    public static final int INVALID_OPTION = -1;

    public static List<Product> products = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);

    public static void askProduct(){
        System.out.println("Enter the product: (name, price, quantity) ");
        String[] fields = sc.nextLine().split(",");
        String name = fields[0];
        double price = Double.parseDouble(fields[1]);
        int quantity = Integer.parseInt(fields[2]);
        products.add(new Product(name, price, quantity));
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
