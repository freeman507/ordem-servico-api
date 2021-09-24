package br.com.felipezanella.resource;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.OrdemServico;
import br.com.felipezanella.service.OrdemServicoService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("ordemservico")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrdemServicoResource {

    @Inject
    OrdemServicoService ordemServicoService;

    @GET
    public List<OrdemServico> findAll() {
        return ordemServicoService.findAll();
    }

    @GET
    @Path("/{id}")
    public OrdemServico findById(@PathParam("id") Long id) throws RecursoNaoEncontradoException {
        return ordemServicoService.findById(id);
    }

    @POST
    @Transactional
    public OrdemServico insert(OrdemServico ordemServico) {
        ordemServicoService.insert(ordemServico);
        return ordemServico;
    }

    @PUT
    @Transactional
    public OrdemServico update(OrdemServico ordemServico) throws RecursoNaoEncontradoException {
        return ordemServicoService.update(ordemServico);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        return ordemServicoService.deleteById(id) ? Response.ok().build() : Response.status(Response.Status.BAD_REQUEST).build();
    }
}
