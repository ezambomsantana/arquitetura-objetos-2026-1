package br.insper.curso.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> list() {
        return alunoRepository.findAll();
    }

    public Aluno getAluno(Integer idAluno) {
        return alunoRepository.findById(idAluno)
                .orElseThrow(() -> new RuntimeException());
    }
}
