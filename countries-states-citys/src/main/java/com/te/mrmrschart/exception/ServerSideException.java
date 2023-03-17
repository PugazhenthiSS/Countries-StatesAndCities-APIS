package com.te.mrmrschart.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ServerSideException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1163077290293459103L;
	private String message;
	public ServerSideException(String message) {
		super(message);
	}
	
}
