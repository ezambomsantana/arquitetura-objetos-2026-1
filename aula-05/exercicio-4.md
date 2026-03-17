# 📚 Exercício 4 – Sistema de Alunos e Disciplinas

## 🎯 Objetivo

Desenvolver uma API REST para gerenciar alunos e disciplinas.

---

## 📦 Entidades

### Aluno

- `id` (Long)
- `nome` (String)
- `matricula` (String)
- `curso` (String)
- `disciplinas` (ManyToMany)

### Disciplina

- `id` (Long)
- `nome` (String)
- `codigo` (String)
- `cargaHoraria` (Integer)
- `alunos` (ManyToMany)

---

## 🔗 Relacionamento

- Um **Aluno** pode se matricular em várias **Disciplinas**.
- Uma **Disciplina** pode ter vários **Alunos**.

Relacionamento N:N.

---

## 🌐 Requisitos

Implementar CRUD completo para:

- Alunos
- Disciplinas

---

## 🚀 Rotas com Regra de Negócio

### 1️⃣ Matricular aluno em disciplina

POST `/alunos/{alunoId}/disciplinas/{disciplinaId}`

- Associar aluno à disciplina.
- Não permitir matrícula duplicada.

---

### 2️⃣ Calcular carga horária total do aluno

GET `/alunos/{id}/carga-horaria-total`

- Somar a carga horária de todas as disciplinas em que o aluno está matriculado.
- Retornar o valor total.

---