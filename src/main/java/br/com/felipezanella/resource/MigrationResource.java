package br.com.felipezanella.resource;

import br.com.felipezanella.service.MigrationService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/migration")
public class MigrationResource {

    @Inject
    MigrationService migrationService;

    @GET
    @Transactional
    public Response migration() {
        migrationService.migration();
        return Response.ok().build();
    }

}
