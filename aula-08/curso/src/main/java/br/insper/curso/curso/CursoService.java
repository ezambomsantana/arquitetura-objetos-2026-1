package br.insper.curso.curso;

import jakarta.transaction.Transactional;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public ResponseCursoDTO save(SaveCursoDTO saveCursoDTO) {
        Curso curso = Curso.toModel(saveCursoDTO);
        curso = cursoRepository.save(curso);
        return ResponseCursoDTO.toDTO(curso);
    }


    public Page<ResponseCursoDTO> list(String nome, NivelCurso nivelCurso, Pageable pageable) {
        if (nome != null) {
            return cursoRepository
                    .findByNomeContaining(nome, pageable)
                    .map(curso -> ResponseCursoDTO.toDTO(curso));
        } else if (nivelCurso != null) {
            return cursoRepository
                    .findByNivel(nivelCurso, pageable)
                    .map(curso -> ResponseCursoDTO.toDTO(curso));
        }
        return cursoRepository
                .findAll(pageable)
                .map(curso -> ResponseCursoDTO.toDTO(curso));
    }

    public Curso get(String codigo) {
        return cursoRepository.findByCodigo(codigo)
                .orElseThrow(() -> new RuntimeException());
    }

    public ResponseCursoDTO getDTO(String codigo) {
        return ResponseCursoDTO.toDTO(get(codigo));
    }

    public ResponseCursoDTO edit(String codigo, EditCursoDTO editCursoDTO) {
        Curso cursoDB = get(codigo);

        cursoDB.setNome(editCursoDTO.getNome());
        cursoDB.setDescricao(editCursoDTO.getDescricao());

        cursoDB = cursoRepository.save(cursoDB);
        return ResponseCursoDTO.toDTO(cursoDB);
    }

}
