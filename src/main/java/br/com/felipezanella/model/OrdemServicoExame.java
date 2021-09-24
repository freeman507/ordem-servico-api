package br.com.felipezanella.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrdemServicoExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    private OrdemServico ordemServico;

    @ManyToOne
    private Exame exame;

    private Double preco;

}
