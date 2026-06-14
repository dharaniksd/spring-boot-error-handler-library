package com.errorhandler.util;

import java.util.UUID;

/**
 * Utility class for generating trace IDs for error tracking
 */
public class TraceIdGenerator {

    private TraceIdGenerator() {
        // Utility class, private constructor
    }

    /**
     * Generate a unique trace ID
     */
    public static String generate() {
        return UUID.randomUUID().toString();
    }

    /**
     * Generate a trace ID with a prefix
     */
    public static String generate(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString();
    }
}
