package game;

/**
 * @author Gamazkov Roman
 */
public class Runner {

    /**
     * Основной метод.
     */
    public static void main(String[] args) throws ScannerException {
        Menu menu = new Menu();
        Logo.printLogo();
        menu.menuGame();
    }
}
