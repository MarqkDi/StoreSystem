package ui;

import jdk.swing.interop.SwingInterOpUtils;
import util.InputUtils;

import java.sql.SQLOutput;

public class ConsoleUI {

    public static void showMainMenu() {
        System.out.println("------Store system------");
        System.out.println("1 - Manage Stock");
        System.out.println("2 - Client");
        System.out.println("0 - Exit");
    }

    public static void showManagerMenu() {
        System.out.println("------Manager system------");
        System.out.println("1 - Add items to stock");
        System.out.println("2 - Delete items from stock");
        System.out.println("3 - List items in stock");
        System.out.println("4 - Update items from stock");
        System.out.println("5 - Reset Stock");
        System.out.println("0 - Return");
    }

    public static void showClientMenu() {
        System.out.println("------Client system------");
        System.out.println("1 - List items from store");
        System.out.println("2 - Buy items from store");
        System.out.println("0 - Return");
    }

    public static int askOption() {
        System.out.print("Choose a option: ");
        return InputUtils.readOption();
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
