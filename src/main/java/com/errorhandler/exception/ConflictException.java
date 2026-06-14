package com.errorhandler.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception thrown when a request conflicts with existing resources
 */
public class ConflictException extends BaseException {
    public static final String ERROR_CODE = "CONFLICT";

    public ConflictException(String message) {
        super(message, HttpStatus.CONFLICT.value(), ERROR_CODE);
    }

    public ConflictException(String message, Throwable cause) {
        super(message, cause, HttpStatus.CONFLICT.value(), ERROR_CODE);
    }
}
