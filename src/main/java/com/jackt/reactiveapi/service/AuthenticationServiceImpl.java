package com.jackt.reactiveapi.service;

import com.jackt.reactiveapi.view.AuthRequestDto;
import com.jackt.reactiveapi.view.AuthResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * <h1>AuthenticationServiceImpl</h1>
 * <p>Implementation of {@link AuthenticationService}</p>
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    public AuthenticationServiceImpl() {

    }

    @Override
    public Mono<AuthResponseDto> doLogin(AuthRequestDto requestDto) {
        return null;
    }
}
