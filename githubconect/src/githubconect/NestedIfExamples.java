package githubconect;

import java.util.Scanner;

public class NestedIfExamples {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        if (age >= 18) {
	            System.out.print("Are you a student (yes/no)? ");
	            String isStudent = scanner.next();

	            if (isStudent.equalsIgnoreCase("yes")) {
	                System.out.println("You are an adult student.");
	            } else {
	                System.out.println("You are an adult non-student.");
	            }
	        } else {
	            System.out.println("You are a minor.");
	        }

	        scanner.close();
	    }

	}


