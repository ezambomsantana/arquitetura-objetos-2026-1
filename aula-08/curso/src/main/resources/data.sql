INSERT INTO curso (codigo, nome, descricao, nivel)
VALUES
    ('ADS', 'Análise e Desenvolvimento de Sistemas', 'Curso de tecnologia em software', 'GRADUACAO'),
    ('CC', 'Ciência da Computação', 'Curso de computação', 'GRADUACAO'),
    ('SI', 'Sistemas de Informação', 'Curso voltado a negócios e TI', 'GRADUACAO'),
    ('ENG', 'Engenharia de Software', 'Curso focado em engenharia de software', 'GRADUACAO'),
    ('DS', 'Data Science', 'Curso de ciência de dados e IA', 'POS_GRADUACAO');

INSERT INTO professor (nome, cpf, email, titulacao)
VALUES
    ('Maria Silva', '12345678901', 'maria@insper.br', 'MESTRE'),
    ('João Souza', '98765432100', 'joao@insper.br', 'DOUTOR'),
    ('Ana Costa', '11111111111', 'ana@insper.br', 'MESTRE'),
    ('Carlos Lima', '22222222222', 'carlos@insper.br', 'DOUTOR'),
    ('Fernanda Alves', '33333333333', 'fernanda@insper.br', 'MESTRE'),
    ('Bruno Rocha', '44444444444', 'bruno@insper.br', 'ESPECIALISTA'),
    ('Juliana Mendes', '55555555555', 'juliana@insper.br', 'DOUTOR'),
    ('Ricardo Teixeira', '66666666666', 'ricardo@insper.br', 'MESTRE'),
    ('Patrícia Gomes', '77777777777', 'patricia@insper.br', 'DOUTOR'),
    ('Lucas Martins', '88888888888', 'lucas@insper.br', 'MESTRE');

INSERT INTO disciplina (nome, carga_horaria, ementa, semestre, id_curso, id_professor)
VALUES
    ('Algoritmos', 60, 'Lógica e algoritmos', 1, 1, 1),
    ('Estruturas de Dados', 60, 'Listas, pilhas e filas', 2, 1, 2),
    ('Banco de Dados', 80, 'Modelagem e SQL', 3, 1, 3),
    ('Programação Web', 80, 'APIs e frontend', 3, 1, 4),
    ('Engenharia de Software', 60, 'Processos e métodos', 4, 1, 5),
    ('Testes de Software', 40, 'Testes automatizados', 4, 1, 6),

    ('Cálculo I', 80, 'Limites e derivadas', 1, 2, 7),
    ('Cálculo II', 80, 'Integrais', 2, 2, 7),
    ('Álgebra Linear', 60, 'Vetores e matrizes', 2, 2, 8),
    ('Arquitetura de Computadores', 60, 'Hardware e organização', 3, 2, 9),
    ('Sistemas Operacionais', 60, 'Processos e memória', 4, 2, 10),
    ('Compiladores', 60, 'Análise léxica e sintática', 5, 2, 2),

    ('Introdução a Sistemas de Informação', 40, 'Conceitos básicos', 1, 3, 1),
    ('Gestão de Projetos', 60, 'PMBOK e Scrum', 2, 3, 5),
    ('Análise de Requisitos', 60, 'Levantamento e modelagem', 3, 3, 3),
    ('Banco de Dados II', 80, 'NoSQL e tuning', 4, 3, 4),
    ('Business Intelligence', 60, 'Dashboards e métricas', 5, 3, 6),
    ('Governança de TI', 40, 'ITIL e COBIT', 6, 3, 8),

    ('Fundamentos de Engenharia de Software', 60, 'Ciclo de vida', 1, 4, 5),
    ('Design Patterns', 60, 'Padrões de projeto', 2, 4, 2),
    ('Arquitetura de Software', 60, 'Microservices e monolitos', 3, 4, 4),
    ('DevOps', 60, 'CI/CD e automação', 4, 4, 6),
    ('Qualidade de Software', 40, 'Métricas e qualidade', 5, 4, 9),
    ('Segurança de Software', 40, 'OWASP e práticas seguras', 6, 4, 10),

    ('Estatística', 60, 'Probabilidade e estatística', 1, 5, 7),
    ('Machine Learning', 80, 'Modelos supervisionados', 2, 5, 2),
    ('Deep Learning', 80, 'Redes neurais', 3, 5, 7),
    ('Big Data', 60, 'Processamento distribuído', 2, 5, 8),
    ('Visualização de Dados', 40, 'Gráficos e storytelling', 3, 5, 9),
    ('NLP', 60, 'Processamento de linguagem natural', 4, 5, 10);