package Object_Class;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2024);
        Car c2 = new Car("Honda", 2024);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // overriding object class toString() method
    @Override
    public String toString() {
        return this.model + " - " + this.year;
    }

    // overriding object class equals() method
    @Override
    public boolean equals(Object obj) {
        // if both the reference variables are pointing to the same object return true
        if (obj == this)
            return true;

        // if the obj is null or not of the same class return false
        if (obj == null || obj.getClass() != this.getClass())
            return false;
            
        Car that = (Car) obj;
        return this.model.equals(that.model) && this.year == that.year;
    }

    // overriding object class hashCode() method
    @Override
    public int hashCode() {
        int initialNum = 200;
        initialNum += this.year;
        initialNum += this.model.hashCode();

        return initialNum;
    }
}