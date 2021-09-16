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

		String EmailRegex = "^[a-z]{3}[[\\.][a-z]{3}]*\\@[a-z]{2}\\.[a-z]{2}[\\.[a-z]{2}]*";
		String Email = input("Email");
		if (Pattern.matches(EmailRegex, Email)) { 
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invalid");
		}
		
		String MobileRegex = "[1-9][0-9]\\s[1-9][0-9]{9}";
		String Mobile = input("Mobile number");
		if (Pattern.matches(MobileRegex, Mobile)) { 
			System.out.println("Mobile number is valid");
		} else {
			System.out.println("Mobile number is invalid");
		}
		
		String passwordRegex = "[0-9A-Za-z]{8}[0-9A-Za-z]*";
		String password = input("password");
		if (Pattern.matches(passwordRegex, password)) { 
			System.out.println("password is valid");
		} else {
			System.out.println("password is invalid");
		}
		

	}
	public static String input(String field) {
		System.out.println("Enter the " + field);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
