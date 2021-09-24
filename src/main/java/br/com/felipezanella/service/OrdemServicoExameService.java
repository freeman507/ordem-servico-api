package br.com.felipezanella.service;

import br.com.felipezanella.model.OrdemServicoExame;
import br.com.felipezanella.repository.OrdemServicoExameRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class OrdemServicoExameService {

    @Inject
    OrdemServicoExameRepository ordemServicoExameRepository;

    public void insertOrUpdate(OrdemServicoExame ordemServicoExame) {
        ordemServicoExameRepository.persist(ordemServicoExame);
    }

    public void deleteByIdOrdemServico(Long idOrdemServico) {
        ordemServicoExameRepository.deleteAll();
    }

    public List<OrdemServicoExame> findAll() {
        return ordemServicoExameRepository.findAll().list();
    }
}
