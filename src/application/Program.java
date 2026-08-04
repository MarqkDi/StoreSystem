package application;

import controller.MenuController;
import util.InputUtils;

public class Program {
    public static void main(String[] args) {
        MenuController.start();
        InputUtils.close();
    }
}
