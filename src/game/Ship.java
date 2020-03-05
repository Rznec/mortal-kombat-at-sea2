package game;

/**
 * Абстрактный класс.
 */
public abstract class Ship implements Orientation {

    /**
     * Параметры корабля.
     */
    public int x;
    public int y;
    public int size;
    public boolean vertical;
    public int health = size;
    public int damage;

    /**
     * Конструктор класса Корабль
     * Перегрузка конструкторов.
     */
    public Ship() {}

    /**
     * Конструктор с двумя входными переменными.
     */
    public Ship(int x, int y) {

        this.x = x;
        this.y = y;
    }
    /**
     * Конструктор с тремя входными переменными.
     */
    public Ship(int x, int y, int size) {

        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Метод возвращающий координату корабля x.
     */
    public String getX() {

        return "x= " + x;
    }

    /**
     * Метод возвращающий координату корабля у.
     */
    public String getY() {

        return "y= " + y;
    }

    /**
     * Метод, определяющий состояние корабля.
     * Перегрузка методов.
     */
    public String condition(int health) {

        return "Корабль цел";
    }
    /**
     * Метод с тремя входными переменными, определяющий состояние корабля.
     */
    public String condition(int health, int damage) {
        int i;
        i = health - damage;
        if (i == health) {
            return "Корабль цел";
        } else if (i == 0) {
            return "Корабль уничтожен";
        } else {
            return "Корабль поврежден";
        }
    }

    /**
     * Метод, определяющий ориентацию корабля.
     */
    @Override
    public void isVertical(boolean vertical) {
        if (vertical) {
            System.out.println("Корабль расположен вертикально");
        } else {
            System.out.println("Корабль расположен горизонтально");
        }
    }
}