package com.hkyang.webservice;

import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("github")
@Validated
@Getter @Setter
public class GithubProperties {

	/**
	 * Github API token ("user:sampletoken")
	 */
	@Pattern(regexp="\\w+:\\w+")
	private String token;
}
