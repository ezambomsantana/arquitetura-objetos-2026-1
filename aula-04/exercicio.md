# 🎵 Sistema de Streaming de Música - Modelagem OO

Os relacionamentos não estão definidos no modelo de propósito, pensem qual seria o melhor relacionamento entre as classes que devem ser implementadas.

---

## 👤 Usuario

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `email : String`
- 🔸 `senha : String`
- 🔸 `dataCadastro : LocalDate`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `paisOrigem : String`

### ⚙️ Métodos (Sugestão)
- 🔹 `assinarPlano(plano : Plano) : void`
- 🔹 `cancelarAssinatura() : void`
- 🔹 `criarPlaylist(nome : String) : Playlist`
- 🔹 `seguirArtista(artista : Artista) : void`
- 🔹 `reproduzirMusica(musica : Musica) : void`

---

## 💳 Assinatura

### 📌 Atributos
- 🔸 `dataInicio : LocalDate`
- 🔸 `dataFim : LocalDate`
- 🔸 `status : StatusAssinatura`
- 🔸 `renovacaoAutomatica : boolean`

### ⚙️ Métodos (Sugestão)
- 🔹 `ativar() : void`
- 🔹 `cancelar() : void`
- 🔹 `renovar() : void`
- 🔹 `verificarStatus() : void`

---

## 📦 Plano

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `valorMensal : double`
- 🔸 `tipo : TipoPlano`
- 🔸 `limiteDispositivos : int`
- 🔸 `permiteDownload : boolean`

### ⚙️ Métodos (Sugestão)
- 🔹 `alterarValor(novoValor : double) : void`

---

## 🎤 Artista

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `paisOrigem : String`
- 🔸 `biografia : String`
- 🔸 `generoPrincipal : String`
- 🔸 `numeroSeguidores : long`
- 🔸 `verificado : boolean`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarAlbum(album : Album) : void`
- 🔹 `ganharSeguidores(qtd : int) : void`

---

## 💿 Album

### 📌 Atributos
- 🔸 `titulo : String`
- 🔸 `dataLancamento : LocalDate`
- 🔸 `genero : String`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarMusica(musica : Musica) : void`
- 🔹 `calcularDuracaoTotal() : int`

---

## 🎵 Musica

### 📌 Atributos
- 🔸 `titulo : String`
- 🔸 `duracaoSegundos : int`
- 🔸 `numeroReproducoes : long`
- 🔸 `genero : String`
- 🔸 `dataLancamento : LocalDate`
- 🔸 `letra : String`

### ⚙️ Métodos (Sugestão)
- 🔹 `reproduzir() : void`
- 🔹 `curtir() : void`
- 🔹 `incrementarReproducoes() : void`

---

## 📂 Playlist

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataCriacao : LocalDate`
- 🔸 `publica : boolean`
- 🔸 `numeroSeguidores : long`
- 🔸 `descricao : String`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarMusica(musica : Musica) : void`
- 🔹 `removerMusica(musica : Musica) : void`
- 🔹 `ganharSeguidores(qtd : int) : void`
- 🔹 `calcularDuracaoTotal() : int`
- 🔹 `verificarMusicaMaisTocada() : Musica`
