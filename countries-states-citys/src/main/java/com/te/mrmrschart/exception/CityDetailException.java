package com.te.mrmrschart.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class CityDetailException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3228388378957871961L;
	
	private String message;

	public CityDetailException(String message) {
		super(message);
	}
	
	
}
