package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.model.*;
import com.cooksys.twitterapi.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import java.util.*;

@Mapper(componentModel="spring", uses={ProfileMapper.class, CredentialMapper.class})
public interface UserMapper {

    User dtoToEntity(CreateUserDto createUserDto);

    @Mapping(source="credential.username", target="username")
    List<UserResponseDto> entitiesToRespond(List<User> users);

}