package pillars.encapsulation;

public class Vehicle {
    private int noOfWheels;
    private int engineCapacity;

    // getter & setter for noOfWheels
    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int value) {
        this.noOfWheels = value;
    }

    Vehicle(int noOfWheels, int engineCapacity) {
        this.noOfWheels = noOfWheels;
        this.engineCapacity = engineCapacity;
    }

}
