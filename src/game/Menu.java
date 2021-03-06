package game;

import java.util.Scanner;

/**
 * Меню игры.
 */
public class Menu {

    private static final String WELCOME = "\n\nWelcome to the game \"MORTAL KOMBAT AT SEA\"!";
    private static final String ENTER_COMMAND = "\nEnter command: ";
    private static final String EXIT = "[0]: exit the game.";
    private Scanner scannerIn = new Scanner(System.in);

    /**
     * Приветствие игрока.
     */
    private void sayHello() {

        System.out.println(WELCOME);
    }

    /**
     * Главное меню игры.
     */
    public void menuGame() throws ScannerException {
        FieldBattle fieldBattle = new FieldBattle();
        sayHello();
        System.out.println("Place of battle:");
        fieldBattle.printField();
        System.out.println(EXIT);
        System.out.println(ENTER_COMMAND);
        int command = scannerIn.nextInt();
        if (command == 0) {
            System.out.println("\nQuit the game! Come back for new victories! ;)");
            System.exit(0);
        } else {
            throw new ScannerException("Wrong command! Try again!");
        }
    }
}
