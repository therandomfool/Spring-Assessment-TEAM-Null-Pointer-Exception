package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Hashtag;
import com.cooksys.twitterapi.model.HashtagDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HashtagMapper {

    HashtagDto entityToDto(Hashtag hashtag);

    List<HashtagDto> entitiesToDtos(List<Hashtag> hashtags);

}
