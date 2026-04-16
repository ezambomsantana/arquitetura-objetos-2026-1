package br.insper.curso.disciplina;

import br.insper.curso.curso.NivelCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> listDisciplinas(
            @RequestParam(required = false, name = "nivel") NivelCurso nivel
    ) {
        return disciplinaService.list(nivel);
    }

    @PostMapping
    public Disciplina saveDisciplina(@RequestBody SaveDisciplinaDTO saveDisciplinaDTO) {
        return disciplinaService.save(saveDisciplinaDTO);
    }

    @PostMapping("/{idDisciplina}/aluno/{idAluno}")
    public Disciplina saveDisciplina(@PathVariable Integer idDisciplina, @PathVariable Integer idAluno) {
        return disciplinaService.addAluno(idDisciplina, idAluno);
    }
}
