package controller;

import services.StockService;
import ui.ConsoleUI;
import util.InputUtils;
import util.Utils;

public class MenuController {

    public static void start() {
        Utils.initialSetup();
        int option = InputUtils.INVALID_OPTION;
        do {
            ConsoleUI.showMainMenu();
            option = ConsoleUI.askOption();
            switch (option) {
                case 1:
                    managerMenu();
                    break;
                case 2:
                    clientMenu();
                    break;
                case 0:
                case InputUtils.INVALID_OPTION:
                    break;
                default:
                    ConsoleUI.showMessage("Invalid option");
            }
        } while (option != 0);
        ConsoleUI.showMessage("Closing application...");
    }

    private static void managerMenu() {
        int option = InputUtils.INVALID_OPTION;
        do {
            ConsoleUI.showManagerMenu();
            option = ConsoleUI.askOption();
            switch (option) {
                case 1:
                    InputUtils.askProduct();
                    break;
                case 2:
                case 3:
                    StockService.listProducts();
                    break;
                case 4:
                    ConsoleUI.showMessage("Not implemented yet");
                    break;
                case 0:
                case InputUtils.INVALID_OPTION:
                    break;
                default:
                    ConsoleUI.showMessage("Invalid option");
            }
        } while (option != 0);
        ConsoleUI.showMessage("Returning to main menu...");
    }

    private static void clientMenu() {
        int option = InputUtils.INVALID_OPTION;
        do {
            ConsoleUI.showClientMenu();
            option = ConsoleUI.askOption();
            switch (option) {
                case 1:
                    StockService.listProducts();
                    break;
                case 2:
                    ConsoleUI.showMessage("Not implemented yet");
                    break;
                case 0:
                case InputUtils.INVALID_OPTION:
                    break;
                default:
                    ConsoleUI.showMessage("Invalid option");
            }
        } while (option != 0);
        ConsoleUI.showMessage("Returning to main menu...");
    }
}
