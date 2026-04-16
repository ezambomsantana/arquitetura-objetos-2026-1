package br.insper.curso.professor;

import br.insper.curso.disciplina.Disciplina;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ResponseProfessorDTO {
    private String nome;
    private String cpf;
    private String email;
    private TitulacaoProfessor titulacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public static ResponseProfessorDTO toDTO(Professor professor) {
        ResponseProfessorDTO dto = new ResponseProfessorDTO();
        dto.setCpf(professor.getCpf());
        dto.setNome(professor.getNome());
        dto.setEmail(professor.getEmail());
        dto.setTitulacao(professor.getTitulacao());
        dto.setDataCriacao(professor.getDataCriacao());
        dto.setDataAtualizacao(professor.getDataAtualizacao());
        return dto;
    }
}
