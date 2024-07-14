package abstraction.interface_keyword;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eats();
        d1.sings();
        d1.walk();

        System.out.println(Dog.legs);
    }
}