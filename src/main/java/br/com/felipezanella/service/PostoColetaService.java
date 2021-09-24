package br.com.felipezanella.service;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.PostoColeta;
import br.com.felipezanella.repository.PostoColetaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PostoColetaService {

    @Inject
    PostoColetaRepository postoColetaRepository;

    public List<PostoColeta> findAll() {
        return postoColetaRepository.findAll().list();
    }

    public PostoColeta findById(Long id) throws RecursoNaoEncontradoException {
        return postoColetaRepository.findByIdOptional(id).orElseThrow(RecursoNaoEncontradoException::new);
    }
}
