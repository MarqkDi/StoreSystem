package util;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static File dataFolder = new File(".", "data");
    public static File warehouse = new File(dataFolder, "warehouse.csv");

    public static void initialSetup() {

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
