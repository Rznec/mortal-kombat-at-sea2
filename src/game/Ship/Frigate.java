package game.Ship;

public class Frigate extends Ship {

    public String country;

    public Frigate() {
    }

    public Frigate(int x, int y, int size) {

        super(x, y, size);
    }

    public void whatCountry() {                                          //метод, определяющий размер корабля
        System.out.println("Страна " + country);
    }
}
