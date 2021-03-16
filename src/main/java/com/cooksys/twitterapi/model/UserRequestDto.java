package com.cooksys.twitterapi.model;


import com.cooksys.twitterapi.entities.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserRequestDto {

    private Credential credential;


}