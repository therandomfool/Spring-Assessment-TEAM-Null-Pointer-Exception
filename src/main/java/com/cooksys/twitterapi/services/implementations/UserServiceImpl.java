package com.cooksys.twitterapi.services.implementations;

import com.cooksys.twitterapi.mappers.UserMapper;
import com.cooksys.twitterapi.repositories.UserRepository;
import com.cooksys.twitterapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

}
