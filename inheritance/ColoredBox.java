package inheritance;

public class ColoredBox extends Box {
    String color;

    ColoredBox() {
        super();
        this.color = "red";
    }

    ColoredBox(int length, String color) {
        super(length);
        this.color = color;
    }

    ColoredBox(int length, int breadth, int height, String color) {
        super(length, breadth, height);
        this.color = color;
    }

    // overriding printBoxDimensions() method
    @Override
    void printBoxDimensions() {
        System.out
                .println("length: " + this.l + " breadth: " + this.b + " height: " + this.h + " color: " + this.color);

    }
}