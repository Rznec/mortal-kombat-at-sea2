package game.Ship;

public class AircraftCarrier extends Ship {
    private final int size = 4;
    public int deck = size;

    public AircraftCarrier() {}

    public AircraftCarrier(int x, int y) {

        super(x, y);
    }

    public void numberOfDeck() {
        System.out.println("У авианосца " + deck + " палубы");

    }
}
