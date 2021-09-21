package com.customExceptions;

public class InvalidLastNameException extends Exception{
	public InvalidLastNameException(String message) {
		super(message);
	}
}
