# 🏬 Sistema de Vendas — Exercício de Programação Orientada a Objetos

## 📌 Objetivo

Desenvolver um sistema em **Java** capaz de processar um arquivo CSV contendo registros de vendas realizadas por uma loja.

O objetivo é aplicar conceitos de:

* Leitura de arquivos
* Estruturas de dados (`List`, `Map`)
* Programação Orientada a Objetos
* Encapsulamento
* Modelagem de domínio
* Separação de responsabilidades

---

# 📂 Arquivo de Entrada

O sistema deverá ler um arquivo chamado `vendas.csv` no seguinte formato:

```
codigoVenda,cliente,produto,quantidade,precoUnitario,data
1,Ana,Notebook,1,3500.00,2024-03-01
2,Bruno,Mouse,2,80.00,2024-03-01
3,Carlos,Teclado,1,150.00,2024-03-02
...
```

### 📑 Campos:

| Campo         | Tipo    | Descrição                    |
| ------------- | ------- | ---------------------------- |
| codigoVenda   | inteiro | Identificador único da venda |
| cliente       | String  | Nome do cliente              |
| produto       | String  | Nome do produto              |
| quantidade    | inteiro | Quantidade comprada          |
| precoUnitario | double  | Preço por unidade            |
| data          | String  | Data da venda                |

---

# 🚀 Parte 1 — Implementação Inicial (Versão Simples)

Primeiro, implemente uma versão funcional que:

* Leia o arquivo CSV
* Armazene os dados em memória
* Imprima todas as vendas no console

---

# 📊 Parte 2 — Cálculos e Estatísticas

Implemente os seguintes cálculos:

---

## 🔢 Cálculos Gerais

1. ✅ **Faturamento total da loja**

   * Soma de todas as vendas (`quantidade × preçoUnitario`)

2. ✅ **Quantidade total de itens vendidos**

3. ✅ **Valor médio por venda**

---

## 👤 Estatísticas por Cliente

4. ✅ **Cliente que mais gastou**
5. ✅ **Total gasto por cada cliente**
6. ✅ **Quantidade de compras por cliente**

---

## 📦 Estatísticas por Produto

7. ✅ **Produto mais vendido (em quantidade)**
8. ✅ **Produto com maior faturamento**
9. ✅ **Quantidade total vendida de cada produto**
10. ✅ **Faturamento total por produto**


# 🧱 Parte 3 — Modelagem Orientada a Objetos

Após a versão inicial, reestruture o sistema utilizando Programação Orientada a Objetos.

Sugestão de classes:

---

## 📦 Classe `Venda`

Representa uma venda individual.

**Possíveis atributos:**

* código
* cliente
* produto
* quantidade
* preçoUnitario
* data

**Possível método:**

* `double getTotal()`

---

## 👤 Classe `Cliente`

Representa um cliente da loja.

**Possíveis atributos:**

* nome
* totalGasto
* quantidadeCompras

**Possíveis métodos:**

* `adicionarCompra(double valor)`
* `getTotalGasto()`

---

## 🛒 Classe `Produto`

Representa um produto vendido.

**Possíveis atributos:**

* nome
* totalVendido
* faturamento

**Possíveis métodos:**

* `registrarVenda(int quantidade, double valor)`
* `getFaturamento()`

---

## 🏬 Classe `Loja` (ou `SistemaVendas`)

Responsável por:

* Armazenar as vendas
* Gerenciar clientes
* Gerenciar produtos
* Calcular estatísticas

**Possíveis métodos:**

* `getFaturamentoTotal()`
* `getClienteQueMaisGastou()`
* `getProdutoMaisVendido()`
* `getProdutoMaiorFaturamento()`

---

# 📌 Requisitos Técnicos

* Utilizar `ArrayList`
* Utilizar `HashMap`
* Separar responsabilidades entre classes
* O `main` deve apenas iniciar o sistema
* Evitar lógica de negócio diretamente no `main`

---

# 🎯 Objetivos de Aprendizagem

Ao final do exercício, o aluno deverá compreender:

* A diferença entre um código procedural e um código orientado a objetos
* Como modelar entidades do mundo real
* Como distribuir responsabilidades entre classes
* A importância do encapsulamento
* Como reduzir código duplicado
* Como melhorar legibilidade e manutenção


# 📎 Entrega

O projeto deve conter:

* Projeto zipado ou repositório no GitHub
* Link no BlackBoard
* 03/03/2026
