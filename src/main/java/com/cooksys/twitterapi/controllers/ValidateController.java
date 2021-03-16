package com.cooksys.twitterapi.controllers;

import com.cooksys.twitterapi.services.ValidateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
@AllArgsConstructor
public class ValidateController {

    private final ValidateService validateService;

    @GetMapping("/username/exists/@{username}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public boolean checkUserExistence(@PathVariable String username) {
        return validateService.checkUserExistence(username);
    }

}
