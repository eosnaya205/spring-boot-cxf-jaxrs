package io.fabric8.quickstarts.cxf.jaxrs;

import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;

@Api("/bigMachineTest")
public class BigMachineServiceImpl implements BigMachineService  {

    public String welcome() {
        return "prueba hola mundo";
    }

	
	public String testRequest(String contenido) {
		System.out.println("-----contenido del request:");
		System.out.println(contenido);
		
		BigMachineServiceResponse response = new BigMachineServiceResponse();
		response.setSuccess("success");			
		response.setMessage("Finished processing transaction #612939415");
		//response.setErrorMessages("Purchase order number in document number: 102478492 exists within 365 days.Sales document  was not changed");
		response.setReturnCode("0");
		//response.setHasError("Yes");
		response.setPOMethod("DFUE");
		//response.setZZEDI_EDITTED("0");
		response.setCurrentEnv("TST");
		return response.getSuccess();
	}


	@Override
	public String testRequestGet() {
		 return "Ok";
	}
	
	

}
