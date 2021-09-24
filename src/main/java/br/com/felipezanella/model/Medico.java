package br.com.felipezanella.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Medico {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Especialidade especialidade;

}
