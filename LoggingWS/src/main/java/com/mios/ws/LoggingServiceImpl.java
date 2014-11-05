package com.mios.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName="LoggingService")
public class LoggingServiceImpl implements LoggingService {

	@WebMethod
	public void logString(String contenido) {
		System.out.println("log: "+contenido);
	}
	
	@WebMethod
	public void logInt(int contenido) {
		System.out.println("log: "+contenido);
	}
}
