package br.com.felipezanella.repository;

import br.com.felipezanella.model.Medico;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MedicoRepository implements PanacheRepository<Medico> {
}
