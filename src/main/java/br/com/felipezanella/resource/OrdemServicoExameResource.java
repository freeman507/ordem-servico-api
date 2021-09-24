package br.com.felipezanella.resource;

import br.com.felipezanella.model.OrdemServicoExame;
import br.com.felipezanella.service.OrdemServicoExameService;
import br.com.felipezanella.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("ordemservicoexame")
@Produces(MediaType.APPLICATION_JSON)
public class OrdemServicoExameResource {

    @Inject
    OrdemServicoExameService ordemServicoExameService;

    @GET
    public List<OrdemServicoExame> findAll() {
        return ordemServicoExameService.findAll();
    }

}
