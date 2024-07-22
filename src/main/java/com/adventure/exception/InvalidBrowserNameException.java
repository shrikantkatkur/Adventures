package com.adventure.exception;

public class InvalidBrowserNameException extends Exception {
	private String msg;
	public InvalidBrowserNameException(String bowserName) {
		msg="InvalidBrowserNameError: " +bowserName;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	}


