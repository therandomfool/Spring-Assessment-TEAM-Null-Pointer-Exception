package com.cooksys.twitterapi.model;

import java.sql.Timestamp;

public class TweetDto {
	private Long id;
	private UserDto creator;
	private Timestamp posted;
	private String content;
	private TweetDto inReplyTo;
	private TweetDto repostOf;
}