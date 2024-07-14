package abstraction.abstract_keyword;

public class Car extends Vehicle {

    void changeWheel(int wheelNo) {
        if (wheelNo <= 4 && wheelNo >= 1) {
            System.out.println("Changing wheel no  " + wheelNo);
        } else {
            System.out.println("Wheel no " + wheelNo + " doesn't exist");
        }
    }

}