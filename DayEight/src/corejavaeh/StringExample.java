package corejavaeh;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            int length = str.length();
            System.out.println("Length of the string: " + length);
            char ch = str.charAt(length + 1); // This line will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

