package com.mios.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SaludosService {	
	
	@WebMethod
	String buenosDias(String nombre); 
	
}
