package basics;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g1 = new Greet();

        g1.Greeting();
        System.out.println("********************");
        g1.Greeting("Leo");
        System.out.println("********************");
        g1.Greeting("Leo", 5);
    }
}

class Greet {
    void Greeting() {
        System.out.println("Hello, Good morning!!");
    }

    void Greeting(String user) {
        System.out.println("Hello " + user + ", Good morning!!");
    }

    void Greeting(String user, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + user + ", Good morning!!");
        }
    }
}