package abstraction.abstract_keyword;

abstract public class Vehicle {
    void accelerate(){
        System.out.println("Vehicle is accelerating");
    };

    abstract void changeWheel(int wheelNo);
}