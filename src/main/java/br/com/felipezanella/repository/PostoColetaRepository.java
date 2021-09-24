package br.com.felipezanella.repository;

import br.com.felipezanella.model.PostoColeta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PostoColetaRepository implements PanacheRepository<PostoColeta> {
}
