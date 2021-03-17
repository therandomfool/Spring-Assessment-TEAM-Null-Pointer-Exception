package com.cooksys.twitterapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Credential {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

}
