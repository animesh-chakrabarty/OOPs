package pillars.inheritance;

public class WeightedBox extends Box {
    int w;

    WeightedBox() {
        this.w = -1;
    }

    WeightedBox(int l, int b, int h, int w) {
        super(l, b, h);
        this.w = w;
    }

    WeightedBox(int side, int w) {
        super(side);
        this.w = w;
    }

    WeightedBox(WeightedBox oldBox) {
        super(oldBox.l, oldBox.b, oldBox.h);
        this.w = oldBox.w;
    }
}
