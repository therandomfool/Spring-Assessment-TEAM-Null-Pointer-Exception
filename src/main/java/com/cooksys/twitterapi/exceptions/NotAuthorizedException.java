package com.cooksys.twitterapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException {

    private static final long serialVersionUID = 5251224556447666930L;

    private String message;

}
