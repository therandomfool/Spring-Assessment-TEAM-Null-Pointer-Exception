package com.cooksys.twitterapi.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private User creator;
	
	@ManyToMany
	private List<User> liked;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp posted;
	
	private String content;
	
	@OneToOne
	private Tweet inReplyTo;
	
	@OneToOne
	private Tweet repostOf;
	
	private boolean deleted;
	
	@ManyToMany
	@JoinTable(name = "tweet_hashtags")
	private List<Hashtag> hashtags;
	
	@ManyToMany
	private List<User> mentionedUsers;
	
}
