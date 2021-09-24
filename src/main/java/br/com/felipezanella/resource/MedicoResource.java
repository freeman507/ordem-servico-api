package br.com.felipezanella.resource;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.Medico;
import br.com.felipezanella.service.MedicoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("medicos")
@Produces(MediaType.APPLICATION_JSON)
public class MedicoResource {

    @Inject
    MedicoService medicoService;

    @GET
    public List<Medico> findAll() {
        return medicoService.findAll();
    }

    @GET
    @Path("/{id}")
    public Medico findById(@PathParam("id") Long id) throws RecursoNaoEncontradoException {
        return medicoService.findById(id);
    }
}
