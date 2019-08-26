package com.jackt.reactiveapi.exception;

public class InvalidJwtException extends BaseException {
    public InvalidJwtException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidJwtException(String message) {
        super(message);
    }
}
