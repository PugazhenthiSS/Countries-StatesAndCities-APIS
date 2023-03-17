package com.te.mrmrschart.exceptionhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.mrmrschart.exception.CityDetailException;
import com.te.mrmrschart.exception.CountryDetailsException;
import com.te.mrmrschart.exception.ServerSideException;
import com.te.mrmrschart.exception.StateDetailException;
import com.te.mrmrschart.response.ResponseError;

@RestControllerAdvice
public class MrMrsCartExceptionController {

	@Autowired
	private ResponseError responseError;
	
	@ExceptionHandler(CountryDetailsException.class)
	ResponseEntity<ResponseError> exception(CountryDetailsException countryDetailsException){
		responseError.setMessage(countryDetailsException.getMessage());
		responseError.setErrorMessage(true);
		return new ResponseEntity<>(responseError, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ServerSideException.class)
	ResponseEntity<ResponseError> exception(ServerSideException serverSideException){
		responseError.setMessage(serverSideException.getMessage());
		responseError.setErrorMessage(true);
		return new ResponseEntity<>(responseError, HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(StateDetailException.class)
	ResponseEntity<ResponseError> exception(StateDetailException stateDetailException){
		responseError.setMessage(stateDetailException.getMessage());
		responseError.setErrorMessage(true);
		return new ResponseEntity<>(responseError, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CityDetailException.class)
	ResponseEntity<ResponseError> exception(CityDetailException cityDetailException){
		responseError.setMessage(cityDetailException.getMessage());
		responseError.setErrorMessage(true);
		return new ResponseEntity<>(responseError, HttpStatus.BAD_REQUEST);
	}
}
