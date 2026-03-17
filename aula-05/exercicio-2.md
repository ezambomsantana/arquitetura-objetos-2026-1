# 🏢 Exercício 2 – Sistema de Departamento e Funcionários

## 🎯 Objetivo

Desenvolver uma API REST para gerenciar departamentos e seus funcionários.

---

## 📦 Entidades

### Departamento

- `id` (Long)
- `nome` (String)
- `orcamento` (Double)

### Funcionario

- `id` (Long)
- `nome` (String)
- `salario` (Double)
- `cargo` (String)
- `departamento` (ManyToOne)

---

## 🔗 Relacionamento

- Um **Departamento** pode ter vários **Funcionários** (1:N).

---

## 🌐 Requisitos

Implementar CRUD completo para:

- Departamentos
- Funcionários

---

## 🚀 Rotas com Regra de Negócio

### 1️⃣ Calcular folha salarial do departamento

GET `/departamentos/{id}/folha-salarial`

- Somar todos os salários dos funcionários vinculados ao departamento.
- Retornar o valor total.

---

### 2️⃣ Impedir exclusão de departamento com funcionários vinculados

DELETE `/departamentos/{id}`

- Caso existam funcionários vinculados ao departamento, retornar erro 400.
- Caso contrário, permitir exclusão.

---