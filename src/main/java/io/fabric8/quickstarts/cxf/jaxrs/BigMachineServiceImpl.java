package io.fabric8.quickstarts.cxf.jaxrs;


import io.swagger.annotations.Api;

@Api("/bigMachineTest")
public class BigMachineServiceImpl implements BigMachineService  {

    public String welcome() {
        return "prueba hola mundo";
    }

	
	public BigMachineServiceResponse testRequest(String contenido) {
		System.out.println("-----contenido del request:");
		System.out.println(contenido);
		
		BigMachineServiceResponse response = new BigMachineServiceResponse();
		response.setSuccess("true");			
		response.setMessage("Finished processing transaction #612939415");
		//response.setErrorMessages("Purchase order number in document number: 102478492 exists within 365 days.Sales document  was not changed");
		response.setReturnCode("0");
		//response.setHasError("Yes");
		response.setPOMethod("DFUE");
		//response.setZZEDI_EDITTED("0");
		response.setCurrentEnv("TST");
		return response;
	}


	public String testRequestGet() {
		 return "Ok";
	}


	public OrderServicePortTypeGetOrderOutput testRequest2(OrderServicePortTypeGetOrderInput contenido) {
		
		System.out.println("-----contenido del request:");
		System.out.println(contenido);
		
		OrderServicePortTypeGetOrderOutput response = new OrderServicePortTypeGetOrderOutput();
		response.setOrder(contenido.getOrder());
		
		return response;
	}



	public String testRequest3(String contenido) {
		System.out.println("-----contenido del request:");
		System.out.println(contenido);
		return "success";
	}
	
	

}
