package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    private static final Scanner sc = new Scanner(System.in);

    public static int readOption() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter only numbers!");
                sc.next();
            }
        }
    }

    public static void close() {
        sc.close();
    }
}
