package com.gl.busk.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="route")
public class Route extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4450841583905901026L;
	
	private List<Coordenate> coordenates;

	@OneToMany
	public List<Coordenate> getCoordenates() {
		return coordenates;
	}

	public void setCoordenates(List<Coordenate> coordenates) {
		this.coordenates = coordenates;
	}
	
}
