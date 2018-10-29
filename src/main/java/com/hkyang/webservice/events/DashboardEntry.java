package com.hkyang.webservice.events;

import java.util.List;

import com.hkyang.webservice.github.RepositoryEvent;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DashboardEntry {
	
	private final GithubProject project;
	
	private final List<RepositoryEvent> events;

	public DashboardEntry(GithubProject project, List<RepositoryEvent> events) {
		this.project = project;
		this.events = events;
	}
}