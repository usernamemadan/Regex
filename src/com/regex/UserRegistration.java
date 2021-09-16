package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String firstNameRegex = "^[A-Z][a-z]{2}[a-z]*";
		String firstName = input("firstName");
		if (Pattern.matches(firstNameRegex, firstName)) { 
			System.out.println("first name is valid");
		} else {
			System.out.println("first name is invalid");
		}
		
		String LastNameRegex = "^[A-Z][a-z]{2}[a-z]*";
		String LastName = input("LastName");
		if (Pattern.matches(firstNameRegex, firstName)) { 
			System.out.println("Last name is valid");
		} else {
			System.out.println("Last name is invalid");
		}
	

	}
	public static String input(String field) {
		System.out.println("Enter the " + field);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
