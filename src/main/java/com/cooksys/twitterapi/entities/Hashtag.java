package com.cooksys.twitterapi.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Hashtag {

	@Id
	@GeneratedValue
	private Long id;
	
	private String label;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp firstUsed;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp lastUsed;
	
	@ManyToMany(mappedBy = "hashtags")
	private List<Tweet> tweets;

}
