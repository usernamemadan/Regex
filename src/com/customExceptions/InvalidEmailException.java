package com.customExceptions;

public class InvalidEmailException extends Exception{
	public InvalidEmailException(String message) {
		super(message);
	}
}
