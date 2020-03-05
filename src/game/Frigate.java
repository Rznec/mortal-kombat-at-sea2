package game;

import game.FieldBattle;

/**
 * Дочерний класс Корабля.
 */
public class Frigate extends Ship {

    public String country;

    /**
     * Перегрузка конструктора.
     */
    public Frigate() {
        super();
    }

    public Frigate(int x, int y, int size) {

        super(x, y, size);
    }

    /**
     * Метод, определяющий размер корабляю.
     */
    protected void whatCountry() {
        System.out.println("Страна " + country);
    }
}
