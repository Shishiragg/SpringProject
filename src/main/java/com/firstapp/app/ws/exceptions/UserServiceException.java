package com.firstapp.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6487349306353817248L;
	
	public UserServiceException(String message) {
		super(message);
	}

}
