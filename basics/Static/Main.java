package basics.Static;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human("Leo", "Messi", 36);
        Human h2 = new Human("Sergio", "busquets", 36);

        System.out.println(Human.population);
        System.out.println(h1.firstName + " " + h1.lastName + " is " + h1.age + " years old");

    }

}
