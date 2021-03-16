package com.cooksys.twitterapi.services.implementations;

import org.springframework.stereotype.Component;

import com.cooksys.twitterapi.repositories.TweetRepository;
import com.cooksys.twitterapi.services.TweetService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class TweetServiceImpl implements TweetService {
	private TweetRepository tweetRepository;
	private TweetMapper tweetMapper;
}
