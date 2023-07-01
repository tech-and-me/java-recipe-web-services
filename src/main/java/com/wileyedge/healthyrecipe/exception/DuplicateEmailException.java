package com.wileyedge.healthyrecipe.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DuplicateEmailException extends RuntimeException {
	public DuplicateEmailException(String msg) {
		super(msg);
	}
}
