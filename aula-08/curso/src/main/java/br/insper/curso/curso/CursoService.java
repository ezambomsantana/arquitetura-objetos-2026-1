package br.insper.curso.curso;

import br.insper.curso.curso.dto.EditCursoDTO;
import br.insper.curso.curso.dto.ResponseCursoDTO;
import br.insper.curso.curso.dto.SaveCursoDTO;
import br.insper.curso.curso.exception.CursoAlreadyExistsException;
import br.insper.curso.curso.exception.CursoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public ResponseCursoDTO save(SaveCursoDTO saveCursoDTO) {

        if (cursoRepository.existsByCodigo(saveCursoDTO.getCodigo())) {
            throw new CursoAlreadyExistsException();
        }
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
                .orElseThrow(() -> new CursoNotFoundException());
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
