package com.gl.busk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="coordenate")
public class Coordenate extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 340556424126059535L;
	//Talvez esto este como el culo
	private long x;
	private long y;
	@Column
	public long getX() {
		return x;
	}
	public void setX(long x) {
		this.x = x;
	}
	@Column
	public long getY() {
		return y;
	}
	public void setY(long y) {
		this.y = y;
	}
	
	
	
}
