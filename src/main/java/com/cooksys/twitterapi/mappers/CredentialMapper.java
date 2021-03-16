package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Credential;
import com.cooksys.twitterapi.model.CredentialRequestDto;
import org.mapstruct.Mapper;

// TODO Ask will if implementing ResponseDto is a good idea due to security and best practices.
/*
   TODO Ask will how to name these methods properly, since they're
  * not Entities but rather Objects embedded in entities.
 */
@Mapper(componentModel = "spring")
public interface CredentialMapper {

    // CredentialResponseDto objectToResponseDto(Credential credential);

    Credential requestDtoToObject(CredentialRequestDto credentialRequestDto);

}
