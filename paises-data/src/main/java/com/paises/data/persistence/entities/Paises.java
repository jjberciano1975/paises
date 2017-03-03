package com.paises.data.persistence.entities;

import java.io.Serializable;

public class Paises implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int codpais_id;
private String pais_tx;
private int media;



public Paises(int codpais_id, String pais_tx, int media) {
	super();
	this.codpais_id = codpais_id;
	this.pais_tx = pais_tx;
	this.media = media;
}
public int getCodpais_id() {
	return codpais_id;
}
public void setCodpais_id(int codpais_id) {
	this.codpais_id = codpais_id;
}
public String getPais_tx() {
	return pais_tx;
}
public void setPais_tx(String pais_tx) {
	this.pais_tx = pais_tx;
}
public int getMedia() {
	return media;
}
public void setMedia(int media) {
	this.media = media;
}



@Override
public String toString() {
	return "Paises [codpais_id=" + codpais_id + ", pais_tx=" + pais_tx + ", media=" + media + "]";
}
}
