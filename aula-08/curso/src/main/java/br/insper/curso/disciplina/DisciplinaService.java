package br.insper.curso.disciplina;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import br.insper.curso.curso.NivelCurso;
import br.insper.curso.professor.Professor;
import br.insper.curso.professor.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private ProfessorService professorService;

    public Disciplina save(Disciplina disciplina) {
        Curso curso = null; //cursoService.get(disciplina.getCurso().getId());
        Professor professor = professorService.get(disciplina.getProfessor().getId());

        disciplina.setCurso(curso);
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> list(NivelCurso nivel) {
        if (nivel != null) {
            return disciplinaRepository.findByCursoNivel(nivel);
        }
        return disciplinaRepository.findAll();
    }

}
