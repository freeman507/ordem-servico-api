package br.com.felipezanella.resource;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.PostoColeta;
import br.com.felipezanella.service.PostoColetaService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/postocoleta")
@Produces(MediaType.APPLICATION_JSON)
public class PostoColetaResource {

    @Inject
    PostoColetaService postoColetaService;

    @GET
    public List<PostoColeta> findAll() {
        return postoColetaService.findAll();
    }

    @GET
    @Path("/{id}")
    public PostoColeta findById(@PathParam("id") Long id) throws RecursoNaoEncontradoException {
        return postoColetaService.findById(id);
    }

}
