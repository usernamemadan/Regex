package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	String firstNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String LastNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String EmailRegex = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
	String MobileRegex = "[1-9][0-9]\\s[1-9][0-9]{9}";
	String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";
	
	public boolean validateFirstName(String firstname) {
		return Pattern.matches(firstNameRegex, firstname);
	}

	public boolean validateLastName(String lastname) {
		return Pattern.matches(LastNameRegex, lastname);
	}

	public boolean validatePhoneNumber(String mobileNumber) {
		return Pattern.matches(MobileRegex, mobileNumber);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(EmailRegex, email);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(passwordRegex, password);
	}

}
