# Novas Buscas e filtros

1 - Buscar curso pelo nome usando filtro containing

2 - Buscar disciplinas de um curso específico por tipo de curso

3 - Buscar disciplinas de um curso específico e por titulacao do professor

4 - Buscar professores nome que começa por uma string

# Paginação

1 - Adicionar paginação em todas as rotas findAll()


# Exercícios

1 - Altere a ligação entre Disciplina e Aluno para adicionar uma entidade
intermediaria chamada turma, pois uma disciplina pode ter várias turmas oferecidas,
uma por semestre por exemplo.
Os relacionamentos devem ser: 
- uma disciplina tem N turmas 
- uma turma sempre tem uma disciplina
- uma turma tem uma lista de alunos
- um aluno também participa de uma lista de turmas


2 - Crie uma rota para criar uma turma em uma disciplina

3 - Crie uma rota para adicionar um aluno em uma turma (remova a aluno x disciplina)

4 - Crie uma rota para remover um aluno em uma turma (remova a aluno x disciplina)

5 - Crie uma rota que liste todas as turmas com paginação e com filtro do semestre daquela turma
