package br.insper.curso.curso;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Page<Curso> list(String nome, NivelCurso nivelCurso, Pageable pageable) {
        if (nome != null) {
            return cursoRepository.findByNomeContaining(nome, pageable);
        } else if (nivelCurso != null) {
            return cursoRepository.findByNivel(nivelCurso, pageable);
        }
        return cursoRepository.findAll(pageable);
    }

    public Curso get(Integer id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso nao encontrado"));
    }

    public Curso edit(Integer id, Curso curso) {
        Curso cursoDB = get(id);

        cursoDB.setDescricao(curso.getDescricao());

        return cursoRepository.save(cursoDB);
    }

}
