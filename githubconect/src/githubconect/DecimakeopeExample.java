package githubconect;

import java.util.Scanner;

public class DecimakeopeExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	      System.out.print("Enter your age: ");
	      int age = scanner.nextInt();

	      if (age < 18) {
	         System.out.println("Sorry, you are not eligible for vote.");
	      } else if (age >= 18 && age < 65) {
	         System.out.println("You are eligible to vote.");
	      } else {
	         System.out.println("You are eligible to vote, but you absent for voting");
	      }

	      scanner.close();
	   }


	}


