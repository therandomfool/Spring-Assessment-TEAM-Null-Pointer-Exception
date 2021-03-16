package com.cooksys.twitterapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.twitterapi.services.HashtagService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("hashtag")
@AllArgsConstructor
public class HashTagController {

	private HashtagService hashTagService;

}
