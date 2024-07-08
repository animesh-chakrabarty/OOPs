package basics;

public class Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", 2);
        d1.print();

        Dog d2 = new Dog("Leo", 3, "Alsassian");
        d2.print();
    }

}

class Dog {
    String name;
    int age;
    String breed;

    Dog(String name1, int age1) {
        name = name1;
        age = age1;
    }

    Dog(String name1, int age1, String breed1) {
        name = name1;
        age = age1;
        breed = breed1;
    }

    void print() {
        System.out.println(name + " is " + age + " years old");
    }
}
