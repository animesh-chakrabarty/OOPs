package abstraction.anonymousClass;

public class Main {
    // anonymous class
    OuterClass anonClassObj = new OuterClass(){
        
    }
}

class OuterClass {
    int outerClassVariable;

    public void printOuterClassVariable() {
        System.out.println(this.outerClassVariable);
    }
}
