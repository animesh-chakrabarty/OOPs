package inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(12);
        b1.printBoxDimensions();

        ColoredBox cb1 = new ColoredBox();
        cb1.printBoxDimensions();

        ColoredBox cb2 = new ColoredBox(12, 23, 45, "green");
        cb2.printBoxDimensions();

        // upcasting
        Box b2 = new ColoredBox();
        b2.printBoxDimensions();

        // downcasting
        // ColoredBox cb3 = new Box();
        // cb3.printBoxDimensions();
    }
}