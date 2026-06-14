package com.errorhandler.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception thrown when a request is malformed or invalid
 */
public class BadRequestException extends BaseException {
    public static final String ERROR_CODE = "BAD_REQUEST";

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST.value(), ERROR_CODE);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause, HttpStatus.BAD_REQUEST.value(), ERROR_CODE);
    }
}
