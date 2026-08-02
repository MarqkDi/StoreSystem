package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class consoleUtils {

    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        int input = -1;

        do {
            System.out.println("------Store system------");
            System.out.println("1 - Manage Warehouse");
            System.out.println("2 - Client");
            System.out.println("0 - Exit");
            System.out.print("Choose a option: ");
            try {
                input = sc.nextInt();
                processInputs(input);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter only numbers!");
                sc.next();
                input = -1;
            }
        } while(input != 0);
        System.out.println("Closing application...");
    }

    public static void processInputs(int input) {

    }
}
