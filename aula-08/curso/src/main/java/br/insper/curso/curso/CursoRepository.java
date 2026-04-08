package br.insper.curso.curso;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    Page<Curso> findByNomeContaining(String nome, Pageable pageable);

    List<Curso> findByNomeAndDescricao(String nome, String descricao);
    // SELECT * FROM curso WHERE nome = ?nome

    List<Curso> findByDataCriacaoGreaterThanEqual(LocalDateTime data);

    Page<Curso> findByNivel(NivelCurso nivelCurso, Pageable pageable);
    // SELECT * From curso WHERE dataCriacao >= ?data

}
