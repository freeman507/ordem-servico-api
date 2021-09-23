package br.com.felipezanella.service;

import br.com.felipezanella.exception.ExameNaoEncontradoException;
import br.com.felipezanella.model.Exame;
import br.com.felipezanella.repository.ExameRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ExameService {

    @Inject
    ExameRepository exameRepository;

    public List<Exame> findAll() {
        return exameRepository.findAll().list();
    }

    public Exame findById(Long id) throws ExameNaoEncontradoException {
        return exameRepository.findByIdOptional(id).orElseThrow(ExameNaoEncontradoException::new);
    }
}
