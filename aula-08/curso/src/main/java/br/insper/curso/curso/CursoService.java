package br.insper.curso.curso;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> list(String nome) {
        if (nome != null) {
            return cursoRepository.findByNome(nome);
        }
        return cursoRepository.findAll();
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
