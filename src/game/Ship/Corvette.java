package game.Ship;

/**
 * Корвет.
 */
public class Corvette extends Ship {
    private final int size = 1;
    private String color;

    public Corvette() {

        super();
    }

    public Corvette(final int x, final int y) {

        super(x, y);
    }

    public final String whatColor() {
        System.out.println("Цвет корабля  " + color);
        return color;
    }

    /**
     * Метод, определяющий расположение корабля.
     */
    @Override
    public void isVertical(final boolean vertical) {
        System.out.println("Корвет однопалубный");
    }
}
