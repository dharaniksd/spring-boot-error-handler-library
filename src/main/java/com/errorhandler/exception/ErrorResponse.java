package com.errorhandler.exception;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Standard error response structure for REST API errors
 */
@Getter
@Setter
public class ErrorResponse {
    private int status;
    private String message;
    private String error;
    private String path;
    private LocalDateTime timestamp;
    private List<FieldError> fieldErrors;
    private String traceId;

    public ErrorResponse(int status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
        this.timestamp = LocalDateTime.now();
    }

    public ErrorResponse(int status, String message, String error, String path) {
        this(status, message, error);
        this.path = path;
    }

    @Getter
    @Setter
    public static class FieldError {
        private String field;
        private String message;
        private Object rejectedValue;

        public FieldError(String field, String message, Object rejectedValue) {
            this.field = field;
            this.message = message;
            this.rejectedValue = rejectedValue;
        }
    }
}
