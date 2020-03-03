package game;

import game.Ship.Frigate;

/**
 * ����������.
 */
public class Runner {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Logo.printLogo();
        menu.menuGame();
    }
}
