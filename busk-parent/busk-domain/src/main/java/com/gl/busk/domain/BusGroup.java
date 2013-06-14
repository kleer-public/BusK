package com.gl.busk.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bus_group")
public class BusGroup extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -387855431238507104L;
	
	private String name;
	private List<BusLine> busLines;

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany
	@JoinColumn(name="line_id")
	public List<BusLine> getBusLines() {
		return busLines;
	}
	
	public void setBusLines(List<BusLine> busLines) {
		this.busLines = busLines;
	}
	
	

}	
	
