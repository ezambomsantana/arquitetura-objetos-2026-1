package br.insper.curso.curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    List<Curso> findByNome(String nome);

    List<Curso> findByDataCriacaoGreaterThan(LocalDateTime dataCriacao);

}
