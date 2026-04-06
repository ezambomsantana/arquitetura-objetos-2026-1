INSERT INTO curso (codigo, nome, descricao, nivel, data_criacao, data_atualizacao)
VALUES
    ('ADS', 'Análise e Desenvolvimento de Sistemas', 'Curso de tecnologia em software', 'GRADUACAO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('CC', 'Ciência da Computação', 'Curso de computação', 'GRADUACAO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('SI', 'Sistemas de Informação', 'Curso voltado a negócios e TI', 'GRADUACAO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('ENG', 'Engenharia de Software', 'Curso focado em engenharia de software', 'GRADUACAO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('DS', 'Data Science', 'Curso de ciência de dados e IA', 'POS_GRADUACAO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO professor (nome, cpf, email, titulacao, data_criacao, data_atualizacao)
VALUES
    ('Maria Silva', '12345678901', 'maria@insper.br', 'MESTRE', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('João Souza', '98765432100', 'joao@insper.br', 'DOUTOR', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Ana Costa', '11111111111', 'ana@insper.br', 'MESTRE', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Carlos Lima', '22222222222', 'carlos@insper.br', 'DOUTOR', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Fernanda Alves', '33333333333', 'fernanda@insper.br', 'MESTRE', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Bruno Rocha', '44444444444', 'bruno@insper.br', 'ESPECIALISTA', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Juliana Mendes', '55555555555', 'juliana@insper.br', 'DOUTOR', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Ricardo Teixeira', '66666666666', 'ricardo@insper.br', 'MESTRE', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Patrícia Gomes', '77777777777', 'patricia@insper.br', 'DOUTOR', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
    ('Lucas Martins', '88888888888', 'lucas@insper.br', 'MESTRE', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO disciplina (nome, carga_horaria, ementa, semestre, id_curso, id_professor, data_criacao, data_atualizacao)
VALUES
-- ADS (curso 1)
('Algoritmos', 60, 'Lógica e algoritmos', 1, 1, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Estruturas de Dados', 60, 'Listas, pilhas e filas', 2, 1, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Banco de Dados', 80, 'Modelagem e SQL', 3, 1, 3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Programação Web', 80, 'APIs e frontend', 3, 1, 4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Engenharia de Software', 60, 'Processos e métodos', 4, 1, 5, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Testes de Software', 40, 'Testes automatizados', 4, 1, 6, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),

-- CC (curso 2)
('Cálculo I', 80, 'Limites e derivadas', 1, 2, 7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Cálculo II', 80, 'Integrais', 2, 2, 7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Álgebra Linear', 60, 'Vetores e matrizes', 2, 2, 8, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Arquitetura de Computadores', 60, 'Hardware e organização', 3, 2, 9, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Sistemas Operacionais', 60, 'Processos e memória', 4, 2, 10, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Compiladores', 60, 'Análise léxica e sintática', 5, 2, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),

-- SI (curso 3)
('Introdução a Sistemas de Informação', 40, 'Conceitos básicos', 1, 3, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Gestão de Projetos', 60, 'PMBOK e Scrum', 2, 3, 5, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Análise de Requisitos', 60, 'Levantamento e modelagem', 3, 3, 3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Banco de Dados II', 80, 'NoSQL e tuning', 4, 3, 4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Business Intelligence', 60, 'Dashboards e métricas', 5, 3, 6, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Governança de TI', 40, 'ITIL e COBIT', 6, 3, 8, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),

-- ENG (curso 4)
('Fundamentos de Engenharia de Software', 60, 'Ciclo de vida', 1, 4, 5, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Design Patterns', 60, 'Padrões de projeto', 2, 4, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Arquitetura de Software', 60, 'Microservices e monolitos', 3, 4, 4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('DevOps', 60, 'CI/CD e automação', 4, 4, 6, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Qualidade de Software', 40, 'Métricas e qualidade', 5, 4, 9, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Segurança de Software', 40, 'OWASP e práticas seguras', 6, 4, 10, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),

-- DS (curso 5)
('Estatística', 60, 'Probabilidade e estatística', 1, 5, 7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Machine Learning', 80, 'Modelos supervisionados', 2, 5, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Deep Learning', 80, 'Redes neurais', 3, 5, 7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Big Data', 60, 'Processamento distribuído', 2, 5, 8, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('Visualização de Dados', 40, 'Gráficos e storytelling', 3, 5, 9, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
('NLP', 60, 'Processamento de linguagem natural', 4, 5, 10, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());