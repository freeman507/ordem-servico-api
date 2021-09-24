package br.com.felipezanella.repository;

import br.com.felipezanella.model.OrdemServico;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrdemServicoRepository implements PanacheRepository<OrdemServico> {
}
