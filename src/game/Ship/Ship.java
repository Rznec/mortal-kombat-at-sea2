package game.Ship;

// Класс корабля
public abstract class Ship implements Orientation {

    //Параметры корабля
    public int x;
    public int y;
    public int size;
    public boolean vertical;
    public int health = size;
    public int damage;

    //Перегрузка конструктора
    public Ship() {}

    //Конструктор с двумя входными параметрами
    public Ship(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Ship(int x, int y, int size) {

        this.x = x;
        this.y = y;
        this.size = size;
    }

    //метод, возвращающий координату x корабля
    public String getX() {

        return "x= " + x;
    }

    //метод, возвращающий координату y корабля
    public String getY() {
        return "y= " + y;
    }

    //Метод, определяющий состояние корабля
    //Перегрузка методов
    public String condition(int health) {

        return "Корабль цел";
    }

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

    //метод, определяющий ориентацию корабля
    @Override
    public void isVertical(boolean vertical) {                                              //метод, определяющий ориентацию корабля
        if (vertical) {
            System.out.println("Корабль расположен вертикально");
        } else {
            System.out.println("Корабль расположен горизонтально");
        }
    }


}