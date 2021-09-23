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

/*This class tests the inputs for user registration inputs
*/
public class userRegistrationTest {

	UserRegistration user;
	Boolean validFirstName;
	Boolean validLastName;
	Boolean validEmail;
	Boolean validMobileNumber;
	Boolean validPassword;

	@Before
	public void init() {
		user = new UserRegistration();
	}

	/*this method test all the happy test cases
	 * all the test cases which are valid are tested in this method
		*/
	@Test
	public void happyTestCase() {
		String firstName = "John";
		String lastName = "Wick";
		String email = "hello.google@gmail.co.in";
		String mobile = "91 9992223334";
		String password = "aaabbb222A*";

		try {
			validFirstName = user.validateFirstName(firstName);
			validLastName = user.validateLastName(lastName);
			validEmail = user.validateEmail(email);
			validMobileNumber = user.validatePhoneNumber(mobile);
			validPassword = user.validatePassword(password);
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
		} finally {
			Assert.assertTrue(validFirstName);
			Assert.assertTrue(validLastName);
			Assert.assertTrue(validEmail);
			Assert.assertTrue(validMobileNumber);
			Assert.assertTrue(validPassword);
		}
	}

	/*this method test all the sad test cases
	 * all the test cases which are fails are tested in this method
		*/
	@Test
	public void sadTestCase() {
		String firstName = "john";
		String lastName = "wu";
		String email = "hello.google.123@gmail.co.in";
		String mobile = "91 99922233342";
		String password = "password123*";

		try {
			validFirstName = user.validateFirstName(firstName);
			validLastName = user.validateLastName(lastName);
			validEmail = user.validateEmail(email);
			validMobileNumber = user.validatePhoneNumber(mobile);
			validPassword = user.validatePassword(password);

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
		} finally {
			Assert.assertTrue(validFirstName);
			Assert.assertTrue(validLastName);
			Assert.assertTrue(validEmail);
			Assert.assertTrue(validMobileNumber);
			Assert.assertTrue(validPassword);
		}
	}
}
