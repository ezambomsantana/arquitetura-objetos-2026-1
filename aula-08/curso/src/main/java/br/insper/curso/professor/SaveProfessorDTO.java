package br.insper.curso.professor;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveProfessorDTO {
    private String nome;
    private String cpf;
    private String email;
    private TitulacaoProfessor titulacao;
}
