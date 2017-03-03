package com.paises.data.persistence.ficheros;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.JsonArray;
import com.paises.data.persistence.actions.EscribeJson;
import com.paises.data.persistence.actions.LeerJson;
import com.paises.data.persistence.entities.Paises;

public class JSONWrite {
  public static void main(String[] args) {
	 
	  Paises pais = new Paises(1,"ESPAÑA",90);
	  Paises pais1 = new Paises(2,"INGLATERRA",90);
	  Paises pais2 = new Paises(3,"ALEMANIA",90);
	  Paises pais3 = new Paises(4,"ITALIA",90);
	  Paises pais4 = new Paises(5,"FRANCIA",90);
	  
	/*  ArrayList<Paises> listapaises =new ArrayList<Paises>();
	  listapaises.add(pais);
	  listapaises.add(pais1);
	  listapaises.add(pais2);
	  listapaises.add(pais3);
	  listapaises.add(pais4);
	  
	  EscribeJson.escribir(listapaises, "paises");
	  */
	
	  Object  obj =LeerJson.leer("paises");
	  
	  JsonArray lista = new JsonArray();
	  lista=(JsonArray) obj;
	  
	//  ArrayList<Paises> lista =new ArrayList<Paises>();
	  //lista =(ArrayList<Paises>) obj; 
		System.out.println(lista);
	}

}
