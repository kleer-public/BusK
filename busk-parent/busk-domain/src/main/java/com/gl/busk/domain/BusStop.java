package com.gl.busk.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bus_stop")
public class BusStop extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 515812365487702710L;

	private Coordenate coordenate;
	private BusLine busLine;
	
	@ManyToOne
	public Coordenate getCoordenate() {
		return coordenate;
	}

	public void setCoordenate(Coordenate coordenate) {
		this.coordenate = coordenate;
	}

	@ManyToOne
	public BusLine getBusLine() {
		return busLine;
	}

	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}
	
	
	
	
	
}
