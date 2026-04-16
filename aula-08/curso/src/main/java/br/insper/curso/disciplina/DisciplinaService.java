package br.insper.curso.disciplina;

import br.insper.curso.aluno.Aluno;
import br.insper.curso.aluno.AlunoService;
import br.insper.curso.curso.Curso;
import br.insper.curso.curso.CursoService;
import br.insper.curso.curso.NivelCurso;
import br.insper.curso.professor.Professor;
import br.insper.curso.professor.ProfessorService;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private AlunoService alunoService;

    public Disciplina save(SaveDisciplinaDTO saveDisciplinaDTO) {
        Curso curso = cursoService.get(saveDisciplinaDTO.getCodigoCurso());
        Professor professor = professorService.findProfessorByCpf(saveDisciplinaDTO.getCpfProfessor());

        Disciplina disciplina = Disciplina.toModel(saveDisciplinaDTO, professor, curso);
        return disciplinaRepository.save(disciplina);
    }



    public List<Disciplina> list(NivelCurso nivel) {
        if (nivel != null) {
            return disciplinaRepository.findByCursoNivel(nivel);
        }
        return disciplinaRepository.findAll();
    }

    public Disciplina addAluno(Integer idDisciplina, Integer idAluno) {

        Aluno aluno = alunoService.getAluno(idAluno);

        Disciplina disciplina = disciplinaRepository.findById(idDisciplina)
                .orElseThrow(() -> new RuntimeException());

        disciplina.getAlunos().add(aluno);
        return disciplinaRepository.save(disciplina);

    }
}
