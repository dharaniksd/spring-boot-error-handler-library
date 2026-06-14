package com.errorhandler.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception thrown when the user is authenticated but not authorized
 */
public class ForbiddenException extends BaseException {
    public static final String ERROR_CODE = "FORBIDDEN";

    public ForbiddenException(String message) {
        super(message, HttpStatus.FORBIDDEN.value(), ERROR_CODE);
    }

    public ForbiddenException(String message, Throwable cause) {
        super(message, cause, HttpStatus.FORBIDDEN.value(), ERROR_CODE);
    }
}
