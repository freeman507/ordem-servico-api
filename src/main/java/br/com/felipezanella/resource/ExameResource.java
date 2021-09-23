package br.com.felipezanella.resource;

import br.com.felipezanella.exception.ExameNaoEncontradoException;
import br.com.felipezanella.model.Exame;
import br.com.felipezanella.service.ExameService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/exames")
@Produces(MediaType.APPLICATION_JSON)
public class ExameResource {

    @Inject
    private ExameService exameService;

    @GET
    public List<Exame> findAll() {
        return exameService.findAll();
    }

    @GET
    @Path("/{id}")
    public Exame findById(@PathParam("id") Long id) throws ExameNaoEncontradoException {
        return exameService.findById(id);
    }

}
