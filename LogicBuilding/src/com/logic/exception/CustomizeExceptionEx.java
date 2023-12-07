package com.logic.exception;

import java.util.Scanner;

public class CustomizeExceptionEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**********Vote Age Check Application*************");
			System.out.println("Enter age (enter -1 to exit):");
			int age = 7;
			if (sc.hasNextInt()) {
                age = sc.nextInt();
            } else {
                sc.next(); // Consume the invalid input
                System.out.println("Put your valid age. Please try again...");
                continue;
            }

			if (age == -1) {
				System.out.println("Exiting Vote Age Check Application. Goodbye!");
				System.exit(0);
			}
			if (age <= 17) {
				try {
					throw new AgeInvalidException(
							"Your Not eligible to  vote now. Put your valid age. Please try again...");
				} catch (AgeInvalidException ex) {
					System.out.println(ex.getMessage());
				}
			} else if (age >= 130) {
				System.out.println("Put your valid age Please try again...");
			} else {
				System.out.println("Congrats! you are eligible to vote...");
			}
		}

	}

}
