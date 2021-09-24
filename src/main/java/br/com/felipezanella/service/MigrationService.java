package br.com.felipezanella.service;

import br.com.felipezanella.model.Especialidade;
import br.com.felipezanella.model.Exame;
import br.com.felipezanella.model.Medico;
import br.com.felipezanella.model.PostoColeta;
import br.com.felipezanella.repository.ExameRepository;
import br.com.felipezanella.repository.MedicoRepository;
import br.com.felipezanella.repository.PostoColetaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MigrationService {

    @Inject
    ExameRepository exameRepository;

    @Inject
    MedicoRepository medicoRepository;

    @Inject
    PostoColetaRepository postoColetaRepository;

    public void migration() {
        exames();
        medicos();
        postoColetas();
    }

    private void postoColetas() {
        for (int i = 1; i <= 5 ; i++) {
            PostoColeta postoColeta = new PostoColeta();
            postoColeta.setDescricao("Posto de Coleta " + i);
            postoColeta.setEndereco("Endereco " + i);
            postoColetaRepository.persist(postoColeta);
        }
    }

    private void medicos() {
        for (int i = 1; i <= 5; i++) {
            Medico medico = new Medico();
            medico.setNome("Medico " + i);
            medico.setEspecialidade(Especialidade.CARDIOLOGISTA);
            medicoRepository.persist(medico);
        }
    }

    private void exames() {
        for (int i = 1; i <= 5; i++) {
            Exame exame = new Exame();
            exame.setDescricao("Exame " + i);
            exame.setPreco(i * 50.0);
            exameRepository.persist(exame);
        }
    }
}
