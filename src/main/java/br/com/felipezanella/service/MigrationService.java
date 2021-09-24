package br.com.felipezanella.service;

import br.com.felipezanella.model.Exame;
import br.com.felipezanella.repository.ExameRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MigrationService {

    @Inject
    ExameRepository exameRepository;

    public void migration() {
        exames();
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
