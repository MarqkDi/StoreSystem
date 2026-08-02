package util;

import java.util.Scanner;

public class InputUtils {

    public static final int INVALID_OPTION = -1;

    private static final Scanner sc = new Scanner(System.in);

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
