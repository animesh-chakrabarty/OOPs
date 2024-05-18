package pillars.encapsulation;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2, 350);
        System.out.println(v1.getNoOfWheels());
        v1.setNoOfWheels(4);
        System.out.println(v1.getNoOfWheels());
    }

}
