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
public class Profile {

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

}
