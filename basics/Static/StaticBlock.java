package basics.Static;

public class StaticBlock {
    static int a = 4;
    static int b;

    // this static block will be executed only once when the class is loaded for the first time
    static {
        System.out.println("print form static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 10;

        StaticBlock s2 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}