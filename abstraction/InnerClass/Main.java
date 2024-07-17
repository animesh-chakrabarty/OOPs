package abstraction.InnerClass;

public class Main {
    // inner class
    class InnerClass {
        int innerClassVariable;

        void printInnerClassVariable() {
            System.out.println(this.innerClassVariable);
        }
    }

    // static nested class
    static class NestedClass {
        int nestedClassVariable;

        void printNestedClassVariable() {
            System.out.println(this.nestedClassVariable);
        }
    }

    public static void main(String[] args) {

        // creating InnerClass object
        Main m1 = new Main();
        InnerClass IC1 = m1.new InnerClass();
        IC1.innerClassVariable = 10;
        IC1.printInnerClassVariable();

        // creating NestedClass object
        NestedClass NC1 = new Main.NestedClass();
        NC1.nestedClassVariable = 20;
        NC1.printNestedClassVariable();

    }
}
