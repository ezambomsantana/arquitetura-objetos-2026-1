package br.insper.curso.aluno;

import br.insper.curso.curso.NivelCurso;
import br.insper.curso.disciplina.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;


    @GetMapping
    public List<Aluno> listAlunos() {
        return alunoService.list();
    }

    @PostMapping
    public Aluno saveAluno(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }
}
