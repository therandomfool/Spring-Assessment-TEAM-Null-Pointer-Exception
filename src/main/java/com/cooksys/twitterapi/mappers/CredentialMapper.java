package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Credential;
import com.cooksys.twitterapi.model.CredentialDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredentialMapper {

    Credential dtoToEmbeddable(CredentialDto credentialDto);

}
