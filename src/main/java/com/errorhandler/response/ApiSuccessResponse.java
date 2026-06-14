package com.errorhandler.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Standardized API success response structure
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSuccessResponse<T> {
    private int status;
    private String message;
    private T data;
    private String traceId;

    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();

    /**
     * Create a success response with default status 200
     */
    public static <T> ApiSuccessResponse<T> ok(T data) {
        return ApiSuccessResponse.<T>builder()
                .status(200)
                .message("Success")
                .data(data)
                .build();
    }

    /**
     * Create a success response with custom message
     */
    public static <T> ApiSuccessResponse<T> ok(T data, String message) {
        return ApiSuccessResponse.<T>builder()
                .status(200)
                .message(message)
                .data(data)
                .build();
    }

    /**
     * Create a success response with custom status code
     */
    public static <T> ApiSuccessResponse<T> of(int status, String message, T data) {
        return ApiSuccessResponse.<T>builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }
}
