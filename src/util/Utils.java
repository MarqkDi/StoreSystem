package util;

import java.io.*;


public class Utils {

    public static File dataFolder = new File(".", "data");
    public static File warehouse = new File(dataFolder, "warehouse.csv");

    public static void initialSetup() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(Utils.warehouse));

            if (dataFolder.mkdir()) {
                System.out.println("Folder 'data' created!" + dataFolder.getParent());
            }

            if (warehouse.createNewFile()) {
                System.out.println("'Warehouse' created successfully!");
            }

            bw.write("Name, Price, Quantity");
            bw.newLine();

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    public static void resetStock() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Utils.warehouse))) {
            bw.write("Name, Price, Quantity RST");
            bw.newLine();
            System.out.println(("Cleared warehouse with success!"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
