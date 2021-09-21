package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.customExceptions.InvalidEmailException;
import com.customExceptions.InvalidFirstNameException;
import com.customExceptions.InvalidLastNameException;
import com.customExceptions.InvalidMoblieNumberException;
import com.customExceptions.InvalidPasswordException;
import com.userregistration.UserRegistration;

public class userRegistrationTest {

	UserRegistration user;

	@Before
	public void init() {
		user = new UserRegistration();
	}

	@Test
	public void happyTestCase() {
		String firstName = "John";
		String lastName = "Wick";
		String email = "hello.google@gmail.co.in";
		String mobile = "91 9992223334";
		String password = "aaabbb222A*";

		try {
			Boolean validFirstName = user.validateFirstName(firstName);
			Boolean validLastName = user.validateLastName(lastName);
			Boolean validEmail = user.validateEmail(email);
			Boolean validMobileNumber = user.validatePhoneNumber(mobile);
			Boolean validPassword = user.validatePassword(password);

			Assert.assertTrue(validFirstName);
			Assert.assertTrue(validLastName);
			Assert.assertTrue(validEmail);
			Assert.assertTrue(validMobileNumber);
			Assert.assertTrue(validPassword);
		} catch (InvalidFirstNameException e) {
			e.printStackTrace();
		} catch (InvalidLastNameException e) {
			e.printStackTrace();
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		} catch (InvalidMoblieNumberException e) {
			e.printStackTrace();
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void sadTestCase() {
		String firstName = "john";
		String lastName = "wu";
		String email = "hello.google.123@gmail.co.in";
		String mobile = "91 99922233342";
		String password = "password123*";
		try {
			Boolean validFirstName = user.validateFirstName(firstName);
			Boolean validLastName = user.validateLastName(lastName);
			Boolean validEmail = user.validateEmail(email);
			Boolean validMobileNumber = user.validatePhoneNumber(mobile);
			Boolean validPassword = user.validatePassword(password);

			Assert.assertTrue(validFirstName);
			Assert.assertTrue(validLastName);
			Assert.assertTrue(validEmail);
			Assert.assertTrue(validMobileNumber);
			Assert.assertTrue(validPassword);
		} catch (InvalidFirstNameException e) {
			e.printStackTrace();
		} catch (InvalidLastNameException e) {
			e.printStackTrace();
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		} catch (InvalidMoblieNumberException e) {
			e.printStackTrace();
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
		}
}

}
