package exception_handling;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("execution start");

        try {
            int res = 4 / 0;
            System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println("!!! ERROR: " + e.getMessage());
        } finally {
            System.out.println("execute irrespective of error");
        }

        try {
            returnNumFromArray(arr);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("!!! ERROR: " + e.getMessage());
        }
        System.out.println("Execution ends");
    }

    static int returnNumFromArray(int arr[]) throws ArrayIndexOutOfBoundsException {
        return arr[10];
    }
}