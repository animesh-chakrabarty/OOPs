package basics.Static;

public class Human {
    String firstName;
    String lastName;
    int age;
    static long population;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Human.population += 1;
    }
}
