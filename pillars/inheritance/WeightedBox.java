package pillars.inheritance;

public class WeightedBox extends Box{
    int w;

    WeightedBox(){
        this.w = -1;
    }
    
    WeightedBox(int l, int b, int h, int w){
        super(l,b,h);
        this.w= w;
    }
}
