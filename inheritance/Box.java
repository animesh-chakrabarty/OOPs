package inheritance;

public class Box {
    int l;
    int b;
    int h;

    Box() {
        this.l = 1;
        this.b = 1;
        this.h = 1;
    }

    Box(int side) {
        this.l = this.b = this.h = side;
    }

    Box(int Length, int Breadth) {
        this.l = Length;
        this.b = Breadth;
    }

    Box(int Length, int Breadth, int Height) {
        this.l = Length;
        this.b = Breadth;
        this.h = Height;
    }

    void printBoxDimensions() {
        System.out.println("length: " + this.l + " breadth: " + this.b + " height: " + this.h);
    }
}