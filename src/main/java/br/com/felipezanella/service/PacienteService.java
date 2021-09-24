package br.com.felipezanella.service;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.Paciente;
import br.com.felipezanella.repository.PacienteRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PacienteService {

    @Inject
    PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll().list();
    }

    public Paciente findById(Long id) throws RecursoNaoEncontradoException {
        return pacienteRepository.findByIdOptional(id).orElseThrow(RecursoNaoEncontradoException::new);
    }
}
