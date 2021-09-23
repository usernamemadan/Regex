package com.userregistration;

import com.functionalInterface.*;

import java.util.regex.Pattern;

import com.customExceptions.InvalidEmailException;
import com.customExceptions.InvalidFirstNameException;
import com.customExceptions.InvalidLastNameException;
import com.customExceptions.InvalidMoblieNumberException;
import com.customExceptions.InvalidPasswordException;

public class UserRegistration {
	/* Initialize the regular expression for each input 
		*/
	String firstNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String LastNameRegex = "^[A-Z][a-z]{2}[a-z]*";
	String EmailRegex = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
	String MobileRegex = "[1-9][0-9]\\s[1-9][0-9]{9}";
	String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";
	
	/* Lambda functions are defined for each input
		*/
	ValidateInput validFirstName = firstName -> Pattern.matches(firstNameRegex, firstName);
	ValidateInput validLastName = lastName -> Pattern.matches(LastNameRegex, lastName);
	ValidateInput validPhoneNumber = mobileNumber -> Pattern.matches(MobileRegex, mobileNumber);
	ValidateInput validEmail = email -> Pattern.matches(EmailRegex, email);
	ValidateInput validPassword = password -> Pattern.matches(passwordRegex, password);
	
	/**
	 * @param firstname
	 * @return true if valid firstname
	 * @throws InvalidFirstNameException
	 */
	public boolean validateFirstName(String firstname) throws InvalidFirstNameException {
		if (validFirstName.validate(firstname)) {
			return true;
		} else {
			throw new InvalidFirstNameException(firstname);
		}
	} 
	
	/**
	 * @param lastname
	 * @return true if valid last name
	 * @throws InvalidFirstNameException
	 */
	public boolean validateLastName(String lastname) throws InvalidLastNameException {
		if (validLastName.validate(lastname)) {
			return true;
		} else {
			throw new InvalidLastNameException(lastname);
		}
	}

	/**
	 * @param mobile number
	 * @return true if valid mobile number is entered
	 * @throws InvalidFirstNameException
	 */
	public boolean validatePhoneNumber(String mobileNumber) throws InvalidMoblieNumberException {
		if (validPhoneNumber.validate(mobileNumber)) {
			return true;
		} else {
			throw new InvalidMoblieNumberException(mobileNumber);
		}
	}
	
	/**
	 * @param email
	 * @return true if email is valid
	 * @throws InvalidEmailException
	 */
	public boolean validateEmail(String email) throws InvalidEmailException {
		if (validEmail.validate(email))
			return true;
		else {
			throw new InvalidEmailException(email);
		}
	}
	
	/**
	 * @param password
	 * @return true if password is valid
	 * @throws InvalidPasswordException
	 */
	public boolean validatePassword(String password) throws InvalidPasswordException {
		if (validPassword.validate(password)) {
			return true;
		} else {
			throw new InvalidPasswordException(password);
		}
	}

}
