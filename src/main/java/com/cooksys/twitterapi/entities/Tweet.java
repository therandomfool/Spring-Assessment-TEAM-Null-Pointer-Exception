package com.cooksys.twitterapi.entities;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Tweet {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn
	private User author;

	private boolean deleted;
	
	@CreationTimestamp
	private Timestamp posted;
	
	private String content;
	
	@ManyToOne
	@JoinColumn
	private Tweet inReplyTo;

	@OneToMany(mappedBy = "inReplyTo")
	private List<Tweet> replies;
	
	@ManyToOne
	@JoinColumn
	private Tweet repostOf;

	@OneToMany(mappedBy = "repostOf")
	private List<Tweet> reposts;

	@ManyToMany
	@JoinTable(name = "tweets_hashtags")
	private List<Hashtag> hashtags;

	@ManyToMany
	@JoinTable(name = "user_likes")
	private List<User> likers;

	@ManyToMany
	@JoinTable(name = "mentioned_users")
	private List<User> mentioned;
	
}
