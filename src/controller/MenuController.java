package controller;

import ui.ConsoleUI;

public class MenuController {
    public static void processInputMainMenu(int input) {
        switch(input) {
            case 1:
                ConsoleUI.managerMenu();
                break;
            case 2:
                ConsoleUI.clientMenu();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
