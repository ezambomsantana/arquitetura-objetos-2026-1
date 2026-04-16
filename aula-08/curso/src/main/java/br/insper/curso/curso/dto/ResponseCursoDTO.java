package br.insper.curso.curso.dto;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.NivelCurso;
import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseCursoDTO {
    private String codigo;
    private String nome;
    private String descricao;
    private NivelCurso nivel;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public static @NonNull ResponseCursoDTO toDTO(Curso curso) {
        ResponseCursoDTO responseCursoDTO = new ResponseCursoDTO();
        responseCursoDTO.setNome(curso.getNome());
        responseCursoDTO.setCodigo(curso.getCodigo());
        responseCursoDTO.setDescricao(curso.getDescricao());
        responseCursoDTO.setDataAtualizacao(curso.getDataAtualizacao());
        responseCursoDTO.setDataCriacao(curso.getDataCriacao());
        return responseCursoDTO;
    }
}
