package com.jackt.reactiveapi.exception;

/**
 * <h1>InvalidRequestBodyException</h1>
 * <p>Exception to be thrown when request bodies are invalid</p>
 *
 * @author jackBranch
 */
public class InvalidRequestBodyException extends BaseException {
    public InvalidRequestBodyException(String message, Throwable cause) {
        super(message, cause);
    }
}
