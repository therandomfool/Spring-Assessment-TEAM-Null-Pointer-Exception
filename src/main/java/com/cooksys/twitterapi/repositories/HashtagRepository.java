package com.cooksys.twitterapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.twitterapi.entities.Hashtag;


@Repository
public interface HashtagRepository extends JpaRepository<Tweet, Long> {

	

}
