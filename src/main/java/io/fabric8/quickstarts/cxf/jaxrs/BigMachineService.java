package io.fabric8.quickstarts.cxf.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

@Path("/bigMachineTest")
@Service
public interface BigMachineService {
	
    @GET
    @Path("")
    @Produces(MediaType.TEXT_PLAIN)
    String welcome();
    
    @POST
    @Path("/testRequest")
    @Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    BigMachineServiceResponse testRequest(String contenido);
    
    @GET
    @Path("/testRequest")
    @Produces(MediaType.APPLICATION_XML)
    String testRequestGet();
    
    @POST
    @Path("/testRequest2")
    @Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    @Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    OrderServicePortTypeGetOrderOutput testRequest2(OrderServicePortTypeGetOrderInput contenido);
    
    @POST
    @Path("/testRequest3")
    @Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    String testRequest3(String contenido);

}
