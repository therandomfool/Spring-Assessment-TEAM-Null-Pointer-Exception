package com.cooksys.twitterapi.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class UserDto {

    private ProfileDto profile;

    private Timestamp joined;

    private String username;

}