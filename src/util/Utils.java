package util;

import java.io.File;
import java.io.IOException;

public class Utils {
    public static void initialSetup() {

        File dataFolder = new File(".", "data");
        File warehouse = new File(dataFolder + "warehouse.csv");

        try {
            if (dataFolder.mkdir()) {
                System.out.println("Folder 'data' created!" + dataFolder.getParent());
            }

            if (warehouse.createNewFile()) {
                System.out.println("'Warehouse' created successfully!");
            }

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
