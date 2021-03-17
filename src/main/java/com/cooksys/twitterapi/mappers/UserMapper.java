package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.User;
import com.cooksys.twitterapi.model.CreateUserDto;
import com.cooksys.twitterapi.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProfileMapper.class, CredentialMapper.class})
public interface UserMapper {

    User dtoToEntity(CreateUserDto createUserDto);

    @Mapping(source = "credential.username", target = "username")
    List<UserDto> entitiesToDtos(List<User> users);

}