package ui;

import controller.MenuController;
import util.InputUtils;

public class ConsoleUI {

    public static void showMenu() {
        int input = -1;

        do {
            System.out.println("------Store system------");
            System.out.println("1 - Manage Stock");
            System.out.println("2 - Client");
            System.out.println("0 - Exit");
            System.out.print("Choose a option: ");
            input = InputUtils.readOption();
            MenuController.processInputMainMenu(input);

        } while(input != 0);
        System.out.println("Closing application...");
    }

    public static void managerMenu() {
        int input = -1;
        do {
            System.out.println("------Manager system------");
            System.out.println("1 - List items in stock");
            System.out.println("2 - Add items to stock");
            System.out.println("3 - Delete items from stock");
            System.out.println("4 - Update items from stock");
            System.out.println("0 - Return");
            System.out.print("Choose a option: ");
            input = InputUtils.readOption();

        } while(input != 0);
        System.out.println("Returning to main menu...");
        showMenu();
    }

    public static void clientMenu() {
        int input = -1;
        do {
            System.out.println("------Client system------");
            System.out.println("1 - List items from store");
            System.out.println("2 - Buy items from store");
            System.out.println("0 - Return");
            System.out.print("Choose a option: ");
            input = InputUtils.readOption();

        }  while(input != 0);
        System.out.println("Returning to main menu...");
        showMenu();
    }
}
