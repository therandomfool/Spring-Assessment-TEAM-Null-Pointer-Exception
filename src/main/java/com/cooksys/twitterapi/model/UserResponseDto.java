package com.cooksys.twitterapi.model;


import com.cooksys.twitterapi.entities.*;

import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDto {

    private Profile profile;
    private Timestamp joined;
    private String username;


}