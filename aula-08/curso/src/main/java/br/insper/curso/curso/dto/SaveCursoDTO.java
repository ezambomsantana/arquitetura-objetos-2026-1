package br.insper.curso.curso.dto;

import br.insper.curso.curso.NivelCurso;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveCursoDTO {
    private String codigo;

    @NotNull(message = "Nome é obrigatório")
    @NotEmpty(message = "Nome é obrigatório")
    private String nome;
    private String descricao;
    @NotNull(message = "Nível é obrigatório")
    private NivelCurso nivel;
}
