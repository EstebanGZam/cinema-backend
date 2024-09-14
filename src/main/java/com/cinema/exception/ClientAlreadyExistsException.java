package com.cinema.exception;

public class ClientAlreadyExistsException extends RuntimeException {
	public ClientAlreadyExistsException(String message) {
		super(message);
	}
}
