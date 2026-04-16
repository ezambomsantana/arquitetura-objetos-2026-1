package br.insper.curso.professor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditProfessorDTO {
    private String nome;
    private TitulacaoProfessor titulacao;
}
