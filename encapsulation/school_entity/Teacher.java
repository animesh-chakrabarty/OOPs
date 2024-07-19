package encapsulation.school_entity;

public class Teacher {
    private String name;
    private int exp;
    private int id;
    public static int totalTeacherCount = 0;

    // constructor
    public Teacher(String name) {
        this.name = name;
        totalTeacherCount++;
        this.id = totalTeacherCount;
    }

    // setter function for exp
    public void setExp(int exp) {
        // validation
        if (exp > 0) {
            this.exp = exp;
        }
    }

    // getter function for exp
    public int getExp() {
        return this.exp;
    }

    // getter function for name
    public String getName() {
        return this.name;
    }

    // getter function for id
    public int getId() {
        return this.id;
    }

    public void printTeacherDetails() {
        System.out.println(this.name + " has " + this.exp + " years of experience. Id - " + this.id);
    }

    public static void printTotalTeacherCount() {
        System.out.println("Total teacher count for this school is: " + totalTeacherCount);
    }

}
