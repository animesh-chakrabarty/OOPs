package abstraction.interface_keyword;

interface Animal {
    int legs = 4;

    void eats();

    default void walk() {
        System.out.println("Animal is walking");
    }
}