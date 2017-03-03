package com.paises.data.persistence.entities;

import java.io.Serializable;

public class Posiciones implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int coddiv_id;
	private int codpos_id;
	private int codpais_nr;
	
	
	
	

	public Posiciones(int coddiv_id, int codpos_id, int codpais_nr) {
		super();
		this.coddiv_id = coddiv_id;
		this.codpos_id = codpos_id;
		this.codpais_nr = codpais_nr;
	}
	public int getCoddiv_id() {
		return coddiv_id;
	}
	public void setCoddiv_id(int coddiv_id) {
		this.coddiv_id = coddiv_id;
	}
	public int getCodpos_id() {
		return codpos_id;
	}
	public void setCodpos_id(int codpos_id) {
		this.codpos_id = codpos_id;
	}
	public int getCodpais_nr() {
		return codpais_nr;
	}
	public void setCodpais_nr(int codpais_nr) {
		this.codpais_nr = codpais_nr;
	}
	
	
	
	@Override
	public String toString() {
		return "Posiciones [coddiv_id=" + coddiv_id + ", codpos_id=" + codpos_id + ", codpais_nr=" + codpais_nr + "]";
	}
}
