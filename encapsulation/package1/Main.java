package encapsulation.package1;

import encapsulation.package1.Teacher;

public class Main {
    static {
        System.out.println("hello from static block");
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Leo");
        t1.printTeacherDetails();

        Teacher t2 = new Teacher("neymar");
        t2.setExp(5);
        t2.printTeacherDetails();

        // static variable
        System.out.println(Teacher.totalTeacherCount);

    }
}
