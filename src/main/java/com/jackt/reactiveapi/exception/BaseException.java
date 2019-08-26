package com.jackt.reactiveapi.exception;

class BaseException extends RuntimeException {

    BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    BaseException(String message) {
        super(message);
    }
}
