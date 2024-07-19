package encapsulation.school_entity;

public class Student {
    private String name;
    private int grade;
    private int id;
    private static int totalStudentCount = 0;

    public Student(String name, int grade) {
        if (grade > 0 && grade <= 12) {
            this.name = name;
            this.grade = grade;
            totalStudentCount++;
            this.id = totalStudentCount;
        } else {
            System.out.println("Please enter a valid grade");
        }
    }

    // getter function for id
    public int getId() {
        return this.id;
    }

    // getter function for grade
    public int getGrade() {
        return this.grade;
    }

    // getter function for name
    public String getName() {
        return this.name;
    }

    // static method to print total student count
    public static void printTotalStudentCount() {
        System.out.println("Total student count for this school is: " + totalStudentCount);
    }
}