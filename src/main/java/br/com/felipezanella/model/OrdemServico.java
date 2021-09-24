package br.com.felipezanella.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    @ManyToOne
    private Paciente paciente;

    private String convenio;

    @ManyToOne
    private PostoColeta postoColeta;

    @ManyToOne
    private Medico medico;

    @JsonManagedReference
    @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrdemServicoExame> ordemServicoExameList = new ArrayList<>();

}
