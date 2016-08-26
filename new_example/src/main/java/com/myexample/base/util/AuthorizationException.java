package com.myexample.base.util;



public class AuthorizationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2292897658277473079L;
	
	
	public AuthorizationException() {
		super();
	}

	public AuthorizationException(String msg) {
		super(msg);
	}

	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public AuthorizationException(Throwable cause) {
		super(cause);
	}
	
}




