package encapsulation.package2;

import encapsulation.school_entity.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Animesh", 11);

        Student s2 = new Student("Rohit", 11);

        Student s3 = new Student("Rohan", 11);

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        System.out.println(s3.getId());

        Student.printTotalStudentCount();
    }

}
