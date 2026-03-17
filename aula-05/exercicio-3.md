# 🎬 Exercício 3 – Sistema de Filmes e Atores

## 🎯 Objetivo

Desenvolver uma API REST para gerenciar filmes e atores.

---

## 📦 Entidades

### Filme

- `id` (Long)
- `titulo` (String)
- `anoLancamento` (Integer)
- `genero` (String)
- `atores` (ManyToMany)

### Ator

- `id` (Long)
- `nome` (String)
- `dataNascimento` (LocalDate)
- `nacionalidade` (String)
- `filmes` (ManyToMany)

---

## 🔗 Relacionamento

- Um **Filme** pode ter vários **Atores**.
- Um **Ator** pode participar de vários **Filmes**.

Relacionamento N:N.

---

## 🌐 Requisitos

Implementar CRUD completo para:

- Filmes
- Atores

---

## 🚀 Rotas com Regra de Negócio

### 1️⃣ Adicionar ator a um filme

POST `/filmes/{filmeId}/atores/{atorId}`

- Associar ator ao filme.
- Não permitir associação duplicada.

---

### 2️⃣ Listar filmes de um ator

GET `/atores/{id}/filmes`

- Retornar todos os filmes vinculados ao ator.

---