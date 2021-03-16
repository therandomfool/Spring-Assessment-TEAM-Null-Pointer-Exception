package com.cooksys.twitterapi.services.UserServiceImpl;

import com.cooksys.twitterapi.mappers.UserMapper;
import com.cooksys.twitterapi.repositories.*;
import com.cooksys.twitterapi.services.UserService;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository ur;
    private UserMapper um;
    
}
