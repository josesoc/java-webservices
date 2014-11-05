package com.mios.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName="SaludosService")
public class SaludosServiceImpl implements SaludosService {

	@WebMethod
	public String buenosDias(String nombre) {
		return "Buenos dias Sr/Sra "+nombre;
	}
	
	@WebMethod
	public String buenosDiasNumero(int numero) {
		if (numero == 0)
			throw new RuntimeException("El numero cero no se permite");
		
		return "Buenos dias Numero "+numero;
	}
}
