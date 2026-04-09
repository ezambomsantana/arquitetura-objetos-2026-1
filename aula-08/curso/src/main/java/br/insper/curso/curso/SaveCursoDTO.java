package br.insper.curso.curso;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveCursoDTO {
    private String codigo;

    @NotNull
    @NotEmpty
    private String nome;
    private String descricao;
    private NivelCurso nivel;
}
