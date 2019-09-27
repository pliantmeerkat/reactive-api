package com.jackt.reactiveapi.service;

import com.jackt.reactiveapi.view.AuthRequestDto;
import com.jackt.reactiveapi.view.AuthResponseDto;
import reactor.core.publisher.Mono;

/**
 * <h1>AuthenticationService</h1>
 * <p>Service to be used for user authentication and token generation</p>
 *
 * @author jackBranch
 */
public interface AuthenticationService {

    Mono<AuthResponseDto> doLogin(AuthRequestDto requestDto);
}
