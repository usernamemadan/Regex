package com.customExceptions;

public class InvalidFirstNameException extends Exception{
	public InvalidFirstNameException(String message) {
		super(message);
	}
}
