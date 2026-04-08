package br.insper.curso.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;


    // /curso?nome=Computação&nivel=GRADUACAO
    @GetMapping
    public Page<Curso> listCursos(
            @RequestParam(required = false, name = "nome") String nome,
            @RequestParam(required = false, name="nivel") NivelCurso nivelCurso,
            Pageable pageable) {
        return cursoService.list(nome, nivelCurso, pageable);
    }

    @PostMapping
    public Curso saveCurso(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @GetMapping("/{id}")
    public Curso getCurso(@PathVariable Integer id) {
        return cursoService.get(id);
    }

    @PutMapping("/{id}")
    public Curso editCurso(@PathVariable Integer id, @RequestBody Curso curso) {
        return cursoService.edit(id, curso);
    }




}
