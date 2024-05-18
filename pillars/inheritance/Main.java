package pillars.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(4, 5, 8);
        System.out.println(b1.l + " " + b1.b + " " + b1.h);

        WeightedBox b2 = new WeightedBox(4, 5, 8, 90);
        System.out.println(b2.l + " " + b2.b + " " + b2.h + " " + b2.w);

        PricedBox b3 = new PricedBox(4, 60, 700);
        System.out.println(b3.l + " " + b3.b + " " + b3.h + " " + b3.w + " " + b3.price);
    }
}
