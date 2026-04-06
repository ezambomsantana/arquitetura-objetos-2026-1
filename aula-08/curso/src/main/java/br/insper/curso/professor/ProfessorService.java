package br.insper.curso.professor;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import br.insper.curso.disciplina.Disciplina;
import br.insper.curso.disciplina.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Professor> list() {
        return professorRepository.findAll();
    }

    public Professor get(Integer id) {
        return professorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
