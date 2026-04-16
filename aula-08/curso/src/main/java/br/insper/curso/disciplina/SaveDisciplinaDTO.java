package br.insper.curso.disciplina;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveDisciplinaDTO {
    private String nome;
    @Min(1)
    private Integer cargaHoraria;
    private String ementa;
    private Integer semestre;
    private String cpfProfessor;
    private String codigoCurso;
}
