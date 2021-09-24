package br.com.felipezanella.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Paciente {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private Sexo sexo;

    private String endereco;

}
