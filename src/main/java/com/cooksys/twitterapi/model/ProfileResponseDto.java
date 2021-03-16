package com.cooksys.twitterapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProfileResponseDto {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

}
