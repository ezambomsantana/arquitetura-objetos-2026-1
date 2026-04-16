package br.insper.curso.professor;

import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import br.insper.curso.disciplina.Disciplina;
import br.insper.curso.disciplina.DisciplinaRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public ResponseProfessorDTO save(SaveProfessorDTO saveProfessorDTO) {

        Professor professor = Professor.toModel(saveProfessorDTO);

        professor = professorRepository.save(professor);
        return ResponseProfessorDTO.toDTO(professor);
    }

    public Page<ResponseProfessorDTO> list(Pageable pageable) {
        return professorRepository
                .findAll(pageable)
                .map(p -> ResponseProfessorDTO.toDTO(p));
    }

    public Professor findProfessorByCpf(String cpf) {
        return professorRepository
                .findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException());
    }

    public ResponseProfessorDTO getDto(String cpf) {
        return ResponseProfessorDTO.toDTO(findProfessorByCpf(cpf));
    }
}
