package com.cooksys.twitterapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ContextDto {

    private TweetDto target;

    private List<TweetDto> before;

    private List<TweetDto> after;

}
