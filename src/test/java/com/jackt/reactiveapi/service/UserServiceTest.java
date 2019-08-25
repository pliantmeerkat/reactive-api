package com.jackt.reactiveapi.service;

import com.jackt.reactiveapi.domain.User;
import com.jackt.reactiveapi.repository.UserRepository;
import com.jackt.reactiveapi.view.UserDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(UserService.class)
public class UserServiceTest {

    @Autowired
    private UserServiceImpl userService;

    @MockBean
    private UserRepository userRepository;

    private UserDto inputDto;
    private User testUser;

    @Before
    public void initialize() {

    }

    @Test
    public void testGetUserReturnsExpectedUserWithOnlyId() {

    }

    @Test
    public void testGetUserReturnsExpectedUserWithOnlyEmail() {

    }

    @Test
    public void testGetUserThrowsWithNullIdAndEmail() {

    }

    @Test
    public void testGetUserThrowsIfUserNotFound() {

    }
}
