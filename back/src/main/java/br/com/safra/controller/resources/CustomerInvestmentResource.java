package br.com.safra.controller.resources;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.safra.controller.services.CustomerEquityService;
import br.com.safra.entities.Investment;

@Path("/client/equity")
public class CustomerInvestmentResource {
    @Inject CustomerEquityService customerEquityService;
    
    @GET
    @Path("/{custumerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Investment> getClientEquity(@PathParam("custumerId") Long custumerId) {
        List<Investment> investments = customerEquityService.list(custumerId);
        
        return investments;
    }

    @POST
    public String add(Investment investment) {
        customerEquityService.add(investment);
        return "Ok";
    }
}