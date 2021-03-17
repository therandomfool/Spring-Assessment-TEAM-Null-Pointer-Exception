package com.cooksys.twitterapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;


@NoArgsConstructor
@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @CreationTimestamp
    private Timestamp joined;

    private boolean deleted;

    @Embedded
    private Credential credentials;

    @Embedded
    private Profile profile;

    @OneToMany(mappedBy = "author")
    private List<Tweet> tweets;

    //followers will control relationship (child side is mapped by)
    @ManyToMany(mappedBy = "following")
    private List<User> followers;

    @ManyToMany
    @JoinTable(
        name = "follower_following"
    )
    private List<User> following;

    // In user
    @ManyToMany(mappedBy = "likers")
    private List<Tweet> likes;

    @ManyToMany(mappedBy = "mentioned")
    private List<Tweet> mentions;

}
