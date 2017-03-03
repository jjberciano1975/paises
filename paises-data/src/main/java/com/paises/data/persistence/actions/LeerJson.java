package com.paises.data.persistence.actions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;



import com.google.gson.JsonParser;

public class LeerJson {
    
	
    public static Object leer (String fichero)  {

		JsonParser parser = new JsonParser();
		Object  obj = null; 
		try {

			  obj = parser.parse(new FileReader(fichero+".json"));
			
			
			
		} catch (FileNotFoundException e) {
			//manejo de error
		} catch (IOException e) {
			//manejo de error
		}
		return obj; 
		//return parser;

	

    }
}


//JSON from String to Object
	//Paises pais = mapper.readValue(jsonInString, Paises.class);