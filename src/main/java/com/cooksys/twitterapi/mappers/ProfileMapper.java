package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Profile;
import com.cooksys.twitterapi.model.ProfileDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileDto embeddableToDto(Profile profile);

    Profile dtoToEmbeddable(ProfileDto profileResponseDto);

}
