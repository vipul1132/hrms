package com.vipul.hrms.exception;

import lombok.experimental.SuperBuilder;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String message) {
		super();
	}
}