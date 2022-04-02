package br.com.safra.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.safra.entities.Investment;

@Path("/client/equity")
public class ClientResource {

    @GET
    @Path("/{clientId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Investment> getClientEquity(@PathParam("clientId") Long clientId) {
        List<Investment> investments = new ArrayList<>();
        investments.add(new Investment("type", 3, 1000D, 1200D, 1400D));
        return investments;
    }
}