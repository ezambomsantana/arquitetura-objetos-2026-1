package br.insper.curso.professor;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import br.insper.curso.disciplina.Disciplina;
import br.insper.curso.disciplina.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CursoService cursoService;

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public Page<Professor> list(Pageable pageable) {
        return professorRepository.findAll(pageable);
    }

    public Professor get(Integer id) {
        return professorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
