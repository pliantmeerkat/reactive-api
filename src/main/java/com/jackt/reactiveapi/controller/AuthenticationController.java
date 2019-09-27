package com.jackt.reactiveapi.controller;

import com.jackt.reactiveapi.constants.ApplicationConstants;
import com.jackt.reactiveapi.service.AuthenticationService;
import com.jackt.reactiveapi.view.AuthRequestDto;
import com.jackt.reactiveapi.view.AuthResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <h1>AuthenticationController</h1>
 * <p>Controller to be used for request authentication, login and token generation</p>
 *
 * @author jackBranch
 */
@RestController
@RequestMapping(path = ApplicationConstants.API_URL_EXT + "login")
public class AuthenticationController extends BaseController {

    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping(value = "")
    public @ResponseBody
    Mono<AuthResponseDto> login(@RequestParam String loginJson) {
        AuthRequestDto authRequestDto = getRequestAsDto(loginJson, AuthRequestDto.class);
        return this.authenticationService.doLogin(authRequestDto);
    }
}
