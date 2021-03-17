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
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @CreationTimestamp
    private Timestamp created;

    private boolean deleted;

    @Embedded
    private Credential credential;

    @Embedded
    private Profile profile;

    //followers will control relationship (child side is mapped by)
    @ManyToMany(mappedBy = "following")
    private List<User> followers;

    @ManyToMany
    @JoinTable(
        name = "follower_following"
    )
    private List<User> following;

    @ManyToMany(mappedBy="liked")
    private List<Tweet> likes;

    @OneToMany(mappedBy="creator")
    private List<Tweet> tweets;

    @ManyToMany(mappedBy="mentioned_user")
    private List<Tweet> mentions;


}
