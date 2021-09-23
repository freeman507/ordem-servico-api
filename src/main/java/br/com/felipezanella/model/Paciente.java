package br.com.felipezanella.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Paciente {

    private String nome;

    private LocalDate dataNascimento;

    private Sexo sexo;

    private String endereco;

}
