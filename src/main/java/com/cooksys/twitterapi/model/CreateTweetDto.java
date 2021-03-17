package com.cooksys.twitterapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateTweetDto {

    private String content;

    private CredentialDto credentials;

}
