package br.insper.curso.professor;

import br.insper.curso.disciplina.Disciplina;
import br.insper.curso.disciplina.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listProfessor() {
        return professorService.list();
    }

    @PostMapping
    public Professor saveDisciplina(@RequestBody Professor professor) {
        return professorService.save(professor);
    }
}
