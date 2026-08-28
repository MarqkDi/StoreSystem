package services;

import model.entities.Product;
import util.InputUtils;
import util.Utils;

import java.io.*;

public class StockService {

    public static void addProduct() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Utils.warehouse, true))) {
            for (Product product : InputUtils.products) {
                bw.write(product.getName() + " , R$" + product.getPrice() + " , " + product.getQuantity());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputUtils.products.clear();
    }

    public static void listProducts() {
        try (BufferedReader br = new BufferedReader(new FileReader(Utils.warehouse))) {

            String sourceLine = br.readLine();
            while (sourceLine != null) {
                System.out.println(sourceLine);
                sourceLine = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void removeProduct(String productName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(Utils.warehouse));
            PrintWriter pw = new PrintWriter(new FileWriter(Utils.warehouse, true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] lineSplit = line.split(",");
                if (lineSplit[0].trim().equalsIgnoreCase(productName)) {
                    pw.println(line);
                    pw.flush();
                }
            }

            pw.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}