package com.cooksys.twitterapi.services.implementations;

import com.cooksys.twitterapi.entities.User;
import com.cooksys.twitterapi.services.UserService;
import com.cooksys.twitterapi.services.ValidateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ValidateServiceImpl implements ValidateService {

    // TODO implement once User entity has been implemented correctly.
    @Override
    public boolean checkUserExistence(String username) {
        return false;
    }
}
