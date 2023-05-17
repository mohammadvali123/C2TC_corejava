package corejavaeh;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}