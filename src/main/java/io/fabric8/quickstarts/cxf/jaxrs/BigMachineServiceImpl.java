package io.fabric8.quickstarts.cxf.jaxrs;

import io.swagger.annotations.Api;

@Api("/bigMachineTest")
public class BigMachineServiceImpl implements BigMachineService  {

    public String welcome() {
        return "prueba hola mundo";
    }

	
	public String testRequest(String contenido) {
		System.out.println("-----contenido del request:");
		System.out.println(contenido);
		return contenido;
	}


	@Override
	public String testRequestGet() {
		 return "Ok";
	}
	
	

}
