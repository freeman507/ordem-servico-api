package br.com.felipezanella.resource;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.Paciente;
import br.com.felipezanella.service.PacienteService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("pacientes")
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @Inject
    PacienteService pacienteService;

    @GET
    public List<Paciente> findAll() {
        return pacienteService.findAll();
    }

    @GET
    @Path("/{id}")
    public Paciente findbyId(@PathParam("id") Long id) throws RecursoNaoEncontradoException {
        return pacienteService.findById(id);
    }
}
