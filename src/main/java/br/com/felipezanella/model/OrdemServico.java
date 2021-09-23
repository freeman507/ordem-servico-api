package br.com.felipezanella.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrdemServico {

    private LocalDate data;

    private Paciente paciente;

    private String convenio;

    private PostoColeta postoColeta;

    private Medico medico;

    private List<OrdemServicoExame> ordemServicoExameList;

}
