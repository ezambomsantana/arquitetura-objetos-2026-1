package br.insper.curso.disciplina;

import br.insper.curso.curso.NivelCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
    List<Disciplina> findByCursoNivel(NivelCurso cursoId);
}
