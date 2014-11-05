package com.mios.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName="MaxiSimpleService")
public class MaxiSimpleServiceImpl implements MaxiSimpleService {

	@WebMethod
	public void stringOut() {
		System.out.println("maxi-simple OK");
	}	
}
