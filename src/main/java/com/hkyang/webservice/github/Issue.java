package com.hkyang.webservice.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Issue {

	private final String htmlUrl;
	private final int number;
	private final String title;
	
	@JsonCreator
	public Issue(@JsonProperty("htmlUrl") String htmlUrl, 
			@JsonProperty("number") int number,
			@JsonProperty("title") String title) {
		this.htmlUrl = htmlUrl;
		this.number = number;
		this.title = title;
	}
}
