package com.cooksys.twitterapi.mappers;

import org.mapstruct.Mapper;

import com.cooksys.twitterapi.entities.Tweet;
import com.cooksys.twitterapi.model.CreateTweetDto;
import com.cooksys.twitterapi.model.TweetDto;

@Mapper(componentModel="spring", uses={ProfileMapper.class, CredentialMapper.class})
public interface TweetMapper {
	
	Tweet requestDtoToEntity(CreateTweetDto createTweetDto);
	
	TweetDto entityToDto(Tweet tweet);
	
}
