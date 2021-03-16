package com.cooksys.twitterapi.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContextResponseDto {
	
	private TweetResponseDto target;
	private List<TweetResponseDto> before;
	private List<TweetResponseDto> after;

}
