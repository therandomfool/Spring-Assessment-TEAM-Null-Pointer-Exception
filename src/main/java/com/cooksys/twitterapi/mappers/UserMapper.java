package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.model.UserRequestDto;
import com.cooksys.twitterapi.model.UserResponseDto;
import com.cooksys.twitterapi.entities.*;
import java.util.*;

public interface UserMapper {
    CredentialMapper requestDtoToEntity(Credential credential);
    Profile entityToResponseDto(ProfileMapper ProfileMapper);
    List<UserResponseDto> entitiesToRespond(List<User> users);


}