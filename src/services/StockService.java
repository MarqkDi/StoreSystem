package services;

import model.entities.Product;
import util.InputUtils;
import util.Utils;

import java.io.*;

public class StockService {

    public void addProduct() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Utils.warehouse, true))) {
            for (Product product : InputUtils.products) {
                bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listProducts() {
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
}
