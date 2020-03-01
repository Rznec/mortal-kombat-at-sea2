package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private char[] Hfield;
    private String[][] field;
    private int sizeField = 10;

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }

    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printField() {
        Hfield = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int coordX = 1;
        int coordY = 0;
        System.out.print(" ");
        for (int x = 0; x < sizeField; x++) {
            System.out.print(" ");
            System.out.print(coordX++);
        }
        for (int y = 0; y < sizeField; y++) {
            if (!(y == 0 && coordX == 11)) ;
        }
        System.out.println();
        for (int y = 0; y < sizeField; y++) {
            System.out.print(Hfield[coordY++]);
            for (int x = 0; x < sizeField; x++) {
                if (!(x == 0 && coordY == 11))
                    System.out.print(" ");
                System.out.print(field[x][y]);
            }
            System.out.println(" ");
        }
    }
}
