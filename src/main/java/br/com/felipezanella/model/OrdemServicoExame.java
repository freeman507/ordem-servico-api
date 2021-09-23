package br.com.felipezanella.model;

import lombok.Data;

@Data
public class OrdemServicoExame {

    private OrdemServico ordemServico;

    private Exame exame;

    private Double preco;

}
