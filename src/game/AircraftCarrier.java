package game;

/**
 * Авианосец.
 */
public class AircraftCarrier extends Ship {
    /**
     * Параметры авианосца.
     */
    private static final int size = 4;
    public int deck = size;

    /**
     * Перегрузка конструктора.
     */
    public AircraftCarrier() {
        super();
    }

    public AircraftCarrier(int x, int y) {

        super(x, y);
    }

    /**
     * Метод, определяющий количество палуб авианосца.
     */
    public void numberOfDeck() {
        System.out.println("У авианосца " + deck + " палубы");

    }
}
