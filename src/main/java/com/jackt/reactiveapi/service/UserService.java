package com.jackt.reactiveapi.service;

import com.jackt.reactiveapi.domain.User;
import com.jackt.reactiveapi.view.UserDto;
import reactor.core.publisher.Mono;

public interface UserService extends BaseService {
    Mono<User> getUser(UserDto userDto);

    Mono<User> createUser(UserDto userDto);

    Mono<User> editUser(UserDto userDto);

    Mono<Boolean> deleteUser(UserDto userDto);
}
