package game;

/**
 * Корвет.
 */
public class Corvette extends Ship {
    /**
     * Параметры корвета.
     */
    private static final int size = 1;
    public String color;

    /**
     * Перегрузка конструктора.
     */
    public Corvette() {

        super();
    }

    public Corvette(final int x, final int y) {

        super(x, y);
    }

    /**
     * Метод, определяющий цвет корабля.
     */
    public final String whatColor() {
        return "Цвет корабля  " + color;
    }

    /**
     * Переопределенный метод, определяющий расположение корабля.
     */
    @Override
    public void isVertical(final boolean vertical) {
        System.out.println("Корвет однопалубный");
    }
}
