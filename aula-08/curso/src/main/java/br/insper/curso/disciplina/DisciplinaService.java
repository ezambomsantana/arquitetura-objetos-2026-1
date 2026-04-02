package br.insper.curso.disciplina;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private CursoService cursoService;

    public Disciplina save(Disciplina disciplina) {
        Curso curso = cursoService.get(disciplina.getCurso().getId());

        disciplina.setCurso(curso);
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> list() {
        return disciplinaRepository.findAll();
    }

}
