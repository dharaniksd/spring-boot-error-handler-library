package com.errorhandler.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Standardized API error response structure
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiErrorResponse {
    private int status;
    private String message;
    private String error;
    private String path;
    private LocalDateTime timestamp;
    private List<FieldErrorDetail> fieldErrors;
    private String traceId;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    /**
     * Nested class for field-level validation errors
     */
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FieldErrorDetail {
        private String field;
        private String message;
        private Object rejectedValue;
    }
}
