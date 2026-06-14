package com.errorhandler.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception thrown when authentication is required but not provided
 */
public class UnauthorizedException extends BaseException {
    public static final String ERROR_CODE = "UNAUTHORIZED";

    public UnauthorizedException(String message) {
        super(message, HttpStatus.UNAUTHORIZED.value(), ERROR_CODE);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause, HttpStatus.UNAUTHORIZED.value(), ERROR_CODE);
    }
}
