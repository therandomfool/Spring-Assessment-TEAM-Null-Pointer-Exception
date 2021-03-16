package com.cooksys.twitterapi.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ContextRequestDto {
	
	private TweetRequestDto target;

}
