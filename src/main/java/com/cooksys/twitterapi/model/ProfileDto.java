package com.cooksys.twitterapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProfileDto {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

}
