package br.com.felipezanella.service;

import br.com.felipezanella.model.*;
import br.com.felipezanella.repository.ExameRepository;
import br.com.felipezanella.repository.MedicoRepository;
import br.com.felipezanella.repository.PacienteRepository;
import br.com.felipezanella.repository.PostoColetaRepository;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.LocalDate;

@ApplicationScoped
public class MigrationService {

    @Inject
    ExameRepository exameRepository;

    @Inject
    MedicoRepository medicoRepository;

    @Inject
    PostoColetaRepository postoColetaRepository;

    @Inject
    PacienteRepository pacienteRepository;

    @Transactional
    void onStart(@Observes StartupEvent ev) {
        migration();
    }

    public void migration() {
        exames();
        medicos();
        postoColetas();
        pacientes();
    }

    private void pacientes() {
        for (int i = 1; i <= 5; i++) {
            Paciente paciente = new Paciente();
            paciente.setNome("Paciente " + i);
            paciente.setEndereco("Endereco Paciente " + i);
            paciente.setSexo(Sexo.FEMININO);
            paciente.setDataNascimento(LocalDate.now().minusYears(i * 5));
            pacienteRepository.persist(paciente);
        }
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
