package com.hkyang.webservice.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Actor {

	private final String login;
	private final String avatarUrl;
	private final String htmlUrl;

	@JsonCreator
	public Actor(@JsonProperty("login") String login, 
			@JsonProperty("avatarUrl") String avatarUrl, @JsonProperty("htmlUrl") String htmlUrl) {
		this.login = login;
		this.avatarUrl = avatarUrl;
		this.htmlUrl = htmlUrl;
	}
}
