package br.insper.curso.curso;

import br.insper.curso.disciplina.Disciplina;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.jspecify.annotations.NonNull;

import java.time.LocalDateTime;
import java.util.List;

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
