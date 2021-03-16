package com.cooksys.twitterapi.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.twitterapi.entities.Hashtag;
import com.cooksys.twitterapi.model.HashtagRequestDto;
import com.cooksys.twitterapi.model.HashtagResponseDto;

@Mapper(componentModel = "spring")
public interface HashtagMapper {
	
	
	Hashtag requestDtoToEntity(HashtagRequestDto hashtagRequestDto);

	HashtagResponseDto entityToResponse(Hashtag hashtag);

	List<HashtagResponseDto> entitiesToResponseDtos(List<Hashtag> hashtag);

}
