package com.cooksys.twitterapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class TweetDto {

    private Long id;

    private UserDto author;

    private Timestamp posted;

    private String content;

    private TweetDto inReplyTo;

    private TweetDto repostOf;

}