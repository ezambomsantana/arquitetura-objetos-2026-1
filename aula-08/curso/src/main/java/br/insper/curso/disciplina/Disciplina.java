package br.insper.curso.disciplina;

import br.insper.curso.curso.Curso;
import br.insper.curso.professor.Professor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    private Integer cargaHoraria;

    private String ementa;

    private Integer semestre;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;


    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;

}
