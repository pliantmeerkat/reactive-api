package com.jackt.reactiveapi.service;

import com.jackt.reactiveapi.domain.User;
import com.jackt.reactiveapi.repository.UserRepository;
import com.jackt.reactiveapi.view.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> getUser(UserDto userDto) {
        User user = mapUserDtoToUser(userDto);
        if (null == user.getId()) {
            return userRepository.findUserByEmail(user.getEmail());
        }
        return userRepository.findById(user.getId());
    }

    @Override
    public Mono<User> createUser(UserDto userDto) {
        User user = mapUserDtoToUser(userDto);
        return userRepository.save(user);
    }

    @Override
    public Mono<User> editUser(UserDto userDto) {
        return null;
    }

    @Override
    public Mono<Boolean> deleteUser(UserDto userDto) {
        return null;
    }

    protected User mapUserDtoToUser(UserDto userDto) {
        return new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
    }
}
