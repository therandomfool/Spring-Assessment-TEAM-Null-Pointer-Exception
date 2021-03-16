package com.cooksys.twitterapi.model;


import java.sql.Timestamp;

import com.cooksys.twitterapi.entities.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDto {

    private ProfileDto profile;
    private Timestamp created;
    private String username;


}