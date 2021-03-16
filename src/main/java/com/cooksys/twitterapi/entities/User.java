package com.cooksys.twitterapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;
import jdk.jfr.Timestamp;


@NoArgsConstructor
@Entity
@Data
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @GeneratedValue
    private Timestamp created;

    private boolean deleted;

    @Embedded
    private Credential credential;

    @Embedded
    private Profile profile;

    @ManyToMany(mappedBy = "following")
    @JoinTable(
        name = "follower_following"
    )
    private List<User> followers;

    @ManyToMany(mappedBy="followers")
    @JoinTable(
        name = "follower_following"
    )
    private List<User> following;

    @OneToMany(mappedBy="liked")
    @JoinTable(
        name = "liked_tweets"
    )
    private List<Tweet> likes;

    @OneToMany(mappedBy="creator")
    private List<Tweet> tweets;

    @OneToMany(mappedBy="mentioned_user")
    @JoinTable(
        name = "tweet_mentions"
    )
    private List<Mentions> mentions;


}
