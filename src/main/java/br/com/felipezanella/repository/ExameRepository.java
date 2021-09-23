package br.com.felipezanella.repository;

import br.com.felipezanella.model.Exame;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExameRepository implements PanacheRepository<Exame> {


}
