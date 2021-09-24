package br.com.felipezanella.service;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.Medico;
import br.com.felipezanella.repository.MedicoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MedicoService {

    @Inject
    MedicoRepository medicoRepository;

    public List<Medico> findAll() {
        return medicoRepository.findAll().list();
    }

    public Medico findById(Long id) throws RecursoNaoEncontradoException {
        return medicoRepository.findByIdOptional(id).orElseThrow(RecursoNaoEncontradoException::new);
    }
}
