package abstraction.interface_keyword;

public class Dog implements Animal, Pet {
    public void eats() {
        System.out.println("Dog eats");
    }

    public void sings() {
        // Animal.legs = 2;
        System.out.println("Dog sings");
    }
}