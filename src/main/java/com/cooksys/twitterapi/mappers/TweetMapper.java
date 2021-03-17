package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Tweet;
import com.cooksys.twitterapi.model.CreateTweetDto;
import com.cooksys.twitterapi.model.TweetDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface TweetMapper {

    Tweet dtoToEntity(CreateTweetDto createTweetDto);

    TweetDto entityToDto(Tweet tweet);

    List<TweetDto> entitiesToDtos(List<Tweet> tweets);

}
