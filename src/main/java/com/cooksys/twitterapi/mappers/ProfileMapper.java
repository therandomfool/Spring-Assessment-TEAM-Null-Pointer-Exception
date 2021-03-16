package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Profile;
import com.cooksys.twitterapi.model.ProfileResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileResponseDto objectToResponseDto(Profile profile);

    Profile requestDtoObjectDto(ProfileResponseDto profileResponseDto);

}
