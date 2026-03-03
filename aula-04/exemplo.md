# 📚 Sistema Acadêmico - Modelagem OO

---

## 👨‍🎓 Aluno

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `cpf : String`
- 🔸 `ra : String`
- 🔸 `email : String`
- 🔸 `status : StatusAluno`

### ⚙️ Métodos (Sugestão)
- 🔹 `matricular(disciplina : Disciplina) : Matricula`
- 🔹 `trancar() : void`
- 🔹 `ativar() : void`
- 🔹 `formar() : void`
- 🔹 `calcularMediaGeral() : double`

---

## 📘 Curso

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `sigla : String`
- 🔸 `anoInicio : int`
- 🔸 `duracao : int`
- 🔸 `disciplinas : List<Disciplina>`
- 🔸 `coordenador : Coordenador`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarDisciplina(disciplina : Disciplina) : void`
- 🔹 `removerDisciplina(codigo : String) : void`
- 🔹 `definirCoordenador(coordenador : Coordenador) : void`

---

## 📝 Matricula

### 📌 Atributos
- 🔸 `aluno : Aluno`
- 🔸 `disciplina : Disciplina`
- 🔸 `nota : double`
- 🔸 `frequencia : double`
- 🔸 `dataMatricula : LocalDate`
- 🔸 `situacao : SituacaoMatricula`

### ⚙️ Métodos (Sugestão)
- 🔹 `registrarNota(nota : double) : void`
- 🔹 `registrarFrequencia(frequencia : double) : void`
- 🔹 `verificarAprovacao() : void`
- 🔹 `trancar() : void`

---

## 📖 Disciplina

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `ementa : String`
- 🔸 `codigo : String`
- 🔸 `cargaHoraria : int`
- 🔸 `professor : Professor`
- 🔸 `sala : Sala`

### ⚙️ Métodos (Sugestão)
- 🔹 `definirProfessor(professor : Professor) : void`
- 🔹 `definirSala(sala : Sala) : void`

---

## 👨‍🏫 Professor

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `cpf : String`
- 🔸 `salario : double`
- 🔸 `email : String`
- 🔸 `disciplinas : List<Disciplina>`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarDisciplina(disciplina : Disciplina) : void`
- 🔹 `removerDisciplina(codigo : String) : void`
- 🔹 `calcularSalarioAnual() : double`

---

## 🏢 Coordenador

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `cpf : String`
- 🔸 `salario : double`
- 🔸 `email : String`
- 🔸 `curso : Curso`

### ⚙️ Métodos (Sugestão)
- 🔹 `definirCurso(curso : Curso) : void`
- 🔹 `calcularSalarioAnual() : double`

---

## 🏫 Sala

### 📌 Atributos
- 🔸 `numero : String`
- 🔸 `predio : String`
- 🔸 `tipo : TipoSala`

### ⚙️ Métodos (Sugestão)
- 🔹 `descricaoCompleta() : String`
