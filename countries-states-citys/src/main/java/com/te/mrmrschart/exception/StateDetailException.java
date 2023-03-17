package com.te.mrmrschart.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class StateDetailException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2337835612584946042L;
	private String message;
	public StateDetailException(String message) {
		super(message);
	}
	
	
}
