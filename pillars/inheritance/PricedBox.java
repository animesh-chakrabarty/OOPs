package pillars.inheritance;

public class PricedBox extends WeightedBox {
    int price;

    PricedBox() {
        super();
        this.price = -1;
    }

    PricedBox(int l, int b, int h, int w, int price) {
        super(l, b, h, w);
        this.price = price;
    }

    PricedBox(int side, int w, int price) {
        super(side, w);
        this.price = price;
    }

    PricedBox(PricedBox oldBox) {
        super(oldBox.l, oldBox.b, oldBox.h, oldBox.w);
        this.price = oldBox.price;
    }
}
