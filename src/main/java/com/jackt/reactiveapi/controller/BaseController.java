package com.jackt.reactiveapi.controller;

import com.jackt.reactiveapi.exception.InvalidRequestBodyException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * <h1>BaseController</h1>
 * <p>Parent class of all controller classes</p>
 *
 * @author jackBranch
 */
abstract class BaseController {

    /**
     * <h2>getRequestAsDto</h2>
     * <p>Converts request json to an entered dto type, throws {@link InvalidRequestBodyException if mapping
     * fails}</p>
     *
     * @param requestJson json to convert
     * @param type        type of dto as class
     * @param <T>         type / class of dto
     * @return request json formatted as dto
     */
    <T> T getRequestAsDto(String requestJson, Class<T> type) {
        try {
            return new ObjectMapper().readValue(requestJson, type);
        } catch (IOException e) {
            throw new InvalidRequestBodyException(e.getMessage(), e);
        }
    }
}
