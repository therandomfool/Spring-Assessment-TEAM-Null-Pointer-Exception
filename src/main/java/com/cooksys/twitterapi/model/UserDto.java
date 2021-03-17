package com.cooksys.twitterapi.model;


import java.sql.Timestamp;



import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {

    private ProfileDto profile;
    private Timestamp created;
    private String username;


}