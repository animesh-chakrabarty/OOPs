package basics;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "harry";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "tommy";
        d2.walk();

    }
}

class Dog {
    // properties
    String breed;
    String name;
    int age;
    String color;

    // methods
    void bark() {
        System.out.println(this.name + " is barking");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }
}