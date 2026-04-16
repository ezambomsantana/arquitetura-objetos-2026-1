package br.insper.curso.curso;

import br.insper.curso.curso.dto.EditCursoDTO;
import br.insper.curso.curso.dto.ResponseCursoDTO;
import br.insper.curso.curso.dto.SaveCursoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;


    // /curso?nome=Computação&nivel=GRADUACAO
    @GetMapping
    public Page<ResponseCursoDTO> listCursos(
            @RequestParam(required = false, name = "nome") String nome,
            @RequestParam(required = false, name="nivel") NivelCurso nivelCurso,
            Pageable pageable) {
        return cursoService.list(nome, nivelCurso, pageable);
    }

    @PostMapping
    public ResponseCursoDTO saveCurso(@Valid @RequestBody SaveCursoDTO curso) {
        return cursoService.save(curso);
    }

    @GetMapping("/{codigo}")
    public ResponseCursoDTO getCurso(@PathVariable String codigo) {
        return cursoService.getDTO(codigo);
    }

    @PutMapping("/{codigo}")
    public ResponseCursoDTO editCurso(@PathVariable String codigo, @RequestBody EditCursoDTO curso) {
        return cursoService.edit(codigo, curso);
    }




}
