package game.Ship;

public class Corvette extends Ship {
    private final int size = 1;
    public String color;

    public Corvette() {
        super();
    }

    public Corvette(int x, int y) {

        super(x, y);
    }

    public String whatColor() {
        System.out.println("Цвет корабля  " + color);
        return color;
    }

    @Override
    public void isVertical(boolean vertical) {                                          //метод, определяющий расположен корабль вертикально или нет (кроме корветта, убрать отсюда)
        System.out.println("Корвет однопалубный");
    }
}
