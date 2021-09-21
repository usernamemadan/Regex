package com.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.userregistration.UserRegistration;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	String email;
	UserRegistration user;
	
	public ParameterizedTest(String email) {
		this.email = email;
	}
    
	@Before
	public void init() {
		user = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList("meai.ad@gami.com.au", "adf@d", "adf.dad@gsg.au.bu", "jaron13@gmail.com", "hal_zieme28@gmail.com", "hazel.gorczany51@hotmail.com" ,"ethyl.casper@yahoo.com","rick.hane95@yahoo.com", "122.222@au" ,"abc gic@gu.gu.cu");
	}

	@Test
	public void testEmail() {
		Assert.assertTrue(user.validateEmail(email));
		System.out.println("Email: " + email + " is valid");
	}
}
