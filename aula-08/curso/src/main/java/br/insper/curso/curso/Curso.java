package br.insper.curso.curso;


import br.insper.curso.disciplina.Disciplina;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.jspecify.annotations.NonNull;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NivelCurso nivel;

    @JsonIgnore
    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;

    public static @NonNull Curso toModel(SaveCursoDTO saveCursoDTO) {
        Curso curso = new Curso();
        curso.setCodigo(saveCursoDTO.getCodigo());
        curso.setNome(saveCursoDTO.getNome());
        curso.setDescricao(saveCursoDTO.getDescricao());
        curso.setNivel(saveCursoDTO.getNivel());
        return curso;
    }

}
