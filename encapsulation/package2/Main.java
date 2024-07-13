package encapsulation.package2;

import encapsulation.package1.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(100);
        System.out.println(s1.getId());
    }

}
