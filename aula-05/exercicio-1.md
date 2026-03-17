# 📘 Exercício 1 – Sistema de Cursos e Aulas

## 🎯 Objetivo

Desenvolver uma API REST utilizando Spring Boot para gerenciar cursos e suas respectivas aulas.

---

## 📦 Entidades

### Curso

- `id` (Long)
- `nome` (String)
- `descricao` (String)
- `cargaHoraria` (Integer)

### Aula

- `id` (Long)
- `titulo` (String)
- `duracaoMinutos` (Integer)
- `ordem` (Integer)
- `curso` (ManyToOne)

---

## 🔗 Relacionamento

- Um **Curso** pode ter várias **Aulas** (1:N).

---

## 🌐 Requisitos

Implementar CRUD completo para:

- Cursos
- Aulas

---

## 🚀 Rotas com Regra de Negócio

### 1️⃣ Listar aulas de um curso ordenadas por ordem

GET `/cursos/{id}/aulas`

- Retornar as aulas ordenadas pelo campo `ordem`.

---

### 2️⃣ Calcular carga horária total do curso

GET `/cursos/{id}/carga-total`

- Somar a duração de todas as aulas vinculadas ao curso.
- Retornar o total em minutos.
