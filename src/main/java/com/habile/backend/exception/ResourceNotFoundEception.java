package com.habile.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundEception extends RuntimeException{
	
/** 
 * if data is not present in database
 * api will call this
 * api will return not found as mentioned in annotation**/
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundEception(String message) {
		super(message);
	}

}
