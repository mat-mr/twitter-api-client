package com.matmr.twitterapiclient.exception.api;

public class EntityNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String message) {
		super(message);
	}

	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}