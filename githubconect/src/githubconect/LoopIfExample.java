package githubconect;

import java.util.Scanner;

public class LoopIfExample {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int num;
		        int evenCount = 0;
		        int oddCount = 0;

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Enter number " + i + ": ");
		            num = scanner.nextInt();

		            if (num % 2 == 0) {
		                System.out.println(num + " is even.");
		                evenCount++;
		            } else {
		                System.out.println(num + " is odd.");
		                oddCount++;
		            }
		        }

		        System.out.println("You entered " + evenCount + " even numbers and " + oddCount + " odd numbers.");

		        scanner.close();
		    }

	}
