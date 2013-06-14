package com.gl.busk.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

public class BusLine extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8624728568289412931L;
	
	private String description;
	private List<Route> routes;

	@Column
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany
	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	

}
