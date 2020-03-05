package game;


/**
 * ����������.
 */
public class Runner {

    /**
     * Основной метод.
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        Logo.printLogo();
        menu.menuGame();
    }
}
