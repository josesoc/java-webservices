package com.mios.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

public interface SaludosService {	

	String buenosDias(String nombre); 
	String buenosDiasNumero(int numero);
	
}
