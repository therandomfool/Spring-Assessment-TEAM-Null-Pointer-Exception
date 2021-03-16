package com.cooksys.twitterapi.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HashtagResponseDto {

	private Long id;

	private String label;

	private Timestamp firstUsed;

	private Timestamp lastUsed;
}
