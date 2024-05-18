// compile-time polymorphism 
// static polymorphism
// achieved via overloading

package pillars.polymorphism;

public class Overloading {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        int ans1 = obj.sum(3, 4);
        int ans2 = obj.sum(3, 4, 5);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}