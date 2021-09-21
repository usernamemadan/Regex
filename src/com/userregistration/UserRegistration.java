package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.customExceptions.InvalidEmailException;
import com.customExceptions.InvalidFirstNameException;
import com.customExceptions.InvalidLastNameException;
import com.customExceptions.InvalidMoblieNumberException;
import com.customExceptions.InvalidPasswordException;

public class UserRegistration {

	String firstNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String LastNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String EmailRegex = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
	String MobileRegex = "[1-9][0-9]\\s[1-9][0-9]{9}";
	String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";

	public boolean validateFirstName(String firstname) throws InvalidFirstNameException {
		if (Pattern.matches(firstNameRegex, firstname)) {
			return true;
		} else {
			throw new InvalidFirstNameException(firstname);
		}
	}

	public boolean validateLastName(String lastname) throws InvalidLastNameException {
		if (Pattern.matches(LastNameRegex, lastname)) {
			return true;
		} else {
			throw new InvalidLastNameException(lastname);
		}
	}

	public boolean validatePhoneNumber(String mobileNumber) throws InvalidMoblieNumberException {
		if(Pattern.matches(MobileRegex, mobileNumber)) {
			return true;
		}
		else {
			throw new InvalidMoblieNumberException(mobileNumber);
		}
	}

	public boolean validateEmail(String email) throws InvalidEmailException {
		if (Pattern.matches(EmailRegex, email))
			return true;
		else {
			throw new InvalidEmailException(email);
		}
	}

	public boolean validatePassword(String password) throws InvalidPasswordException {
		if (Pattern.matches(passwordRegex, password)) {
			return true;
		} else {
			throw new InvalidPasswordException(password);
		}
	}

}
