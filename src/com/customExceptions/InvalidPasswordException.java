package com.customExceptions;

public class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
		super(message);
	}
}
