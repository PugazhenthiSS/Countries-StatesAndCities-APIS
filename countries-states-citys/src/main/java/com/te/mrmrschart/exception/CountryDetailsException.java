package com.te.mrmrschart.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class CountryDetailsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3666512999315632167L;
	
	private String message;

	public CountryDetailsException(String message) {
		super(message);
	}
	
	
}
