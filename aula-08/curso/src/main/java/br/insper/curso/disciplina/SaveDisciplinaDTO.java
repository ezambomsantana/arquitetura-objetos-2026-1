package br.insper.curso.disciplina;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveDisciplinaDTO {
    private String nome;
    private Integer cargaHoraria;
    private String ementa;
    private Integer semestre;
    private String cpfProfessor;
    private String codigoCurso;
}
