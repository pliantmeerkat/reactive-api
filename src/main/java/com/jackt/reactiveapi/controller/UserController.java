package com.jackt.reactiveapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackt.reactiveapi.domain.User;
import com.jackt.reactiveapi.service.UserService;
import com.jackt.reactiveapi.view.UserDto;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/user")
public class UserController extends BaseController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "")
    public @ResponseBody
    Mono<User> getUser(@RequestParam String userJson) throws Exception {
        UserDto userDto = new ObjectMapper().readValue(userJson, UserDto.class);
        return userService.getUser(userDto);
    }

    @PostMapping(value = "")
    public @ResponseBody
    Mono<User> createUser(@RequestBody String userJson) throws Exception {
        UserDto userDto = new ObjectMapper().readValue(userJson, UserDto.class);
        return userService.createUser(userDto);
    }
}
