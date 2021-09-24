package br.com.felipezanella.service;

import br.com.felipezanella.exception.RecursoNaoEncontradoException;
import br.com.felipezanella.model.OrdemServico;
import br.com.felipezanella.repository.OrdemServicoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class OrdemServicoService {

    @Inject
    OrdemServicoRepository ordemServicoRepository;

    public List<OrdemServico> findAll() {
        return ordemServicoRepository.findAll().list();
    }

    public OrdemServico findById(Long id) throws RecursoNaoEncontradoException {
        return ordemServicoRepository.findByIdOptional(id).orElseThrow(RecursoNaoEncontradoException::new);
    }

    public void insert(OrdemServico ordemServico) {
        ordemServicoRepository.persist(ordemServico);
    }

    public boolean deleteById(Long id) {
        return ordemServicoRepository.deleteById(id);
    }

    public OrdemServico update(OrdemServico ordemServico) {
        OrdemServico entity = ordemServicoRepository.findById(ordemServico.getId());
        entity.setConvenio(ordemServico.getConvenio());
        entity.setData(ordemServico.getData());
        entity.setMedico(ordemServico.getMedico());
        entity.setPaciente(ordemServico.getPaciente());
        entity.setPostoColeta(ordemServico.getPostoColeta());
        entity.setOrdemServicoExameList(ordemServico.getOrdemServicoExameList());
        return entity;
    }
}
