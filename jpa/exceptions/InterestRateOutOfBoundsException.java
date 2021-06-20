package com.MeritBankAppjpa.jpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InterestRateOutOfBoundsException extends Exception {

	public InterestRateOutOfBoundsException(String errorMessage) {
		super(errorMessage);
	}
}
