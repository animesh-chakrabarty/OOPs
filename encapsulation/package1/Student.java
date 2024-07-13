public class Student {
    private String name;
    private int id;

    // setter function for id
    public void setId(int id) {
        // validation
        if (id > 0) {
            this.id = id;
        }
    }

    // getter function for id
    public int getId() {
        return this.id;
    }
}