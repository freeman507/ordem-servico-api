package br.com.felipezanella.repository;

import br.com.felipezanella.model.OrdemServicoExame;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrdemServicoExameRepository implements PanacheRepository<OrdemServicoExame> {
}
