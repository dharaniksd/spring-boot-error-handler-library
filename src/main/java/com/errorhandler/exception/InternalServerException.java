package com.errorhandler.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception thrown when an internal server error occurs
 */
public class InternalServerException extends BaseException {
    public static final String ERROR_CODE = "INTERNAL_SERVER_ERROR";

    public InternalServerException(String message) {
        super(message, HttpStatus.INTERNAL_SERVER_ERROR.value(), ERROR_CODE);
    }

    public InternalServerException(String message, Throwable cause) {
        super(message, cause, HttpStatus.INTERNAL_SERVER_ERROR.value(), ERROR_CODE);
    }
}
