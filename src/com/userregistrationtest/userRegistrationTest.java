package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
	}
	
	@Test
	public void sadTestCase() {
		String firstName = "john";
		String lastName = "wu";
		String email = "hello.google.123@gmail.co.in";
		String mobile = "91 99922233342";
		String password = "password123*";
		
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
	}
	
}
