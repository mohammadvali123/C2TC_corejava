package corejavaeh;

import java.util.Scanner;

public class StringBufferEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            StringBuffer buffer = new StringBuffer(scanner.nextLine());
            int length = buffer.length();
            System.out.println("Length of the string: " + length);
            char ch = buffer.charAt(length + 1); // This line will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

