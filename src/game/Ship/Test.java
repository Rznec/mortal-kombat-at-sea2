package game.Ship;


public class Test {

    public static void main(String[] args) {
        AircraftCarrier ac1 = new AircraftCarrier(1, 1);
        ac1.numberOfDeck();
        ac1.isVertical(false);
        System.out.println(ac1.condition(4,1));

        Corvette cov1 = new Corvette(7, 8);
        cov1.isVertical(true);
        System.out.println(cov1.getX());
        System.out.println(cov1.condition(1));


        Corvette cov2 = new Corvette();
        cov2.x = 5;
        cov2.y = 4;
        cov2.color = "grey";
        System.out.println(cov2.getY());
        cov2.whatColor();
        System.out.println("Корвет создан");

        Frigate fr1 = new Frigate();
        fr1.x = 7;
        fr1.y = 8;
        fr1.size = 2;
        fr1.country = "Russia";
        fr1.whatCountry();
        {
            Helper.print("Желаю удачи в бою");
        }
    }
}