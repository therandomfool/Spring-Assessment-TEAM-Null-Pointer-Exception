package com.cooksys.twitterapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateUserDto {

    private CredentialDto credentials;
    private ProfileDto profile;

}
