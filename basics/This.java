package basics;

public class This {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", 4);
        d1.Print();
        d1.callPrint();
    }
}

class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Print() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    void callPrint() {
        this.Print();
    }
}
