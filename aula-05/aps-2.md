# 🎧 PROJETO – API REST: Mini Spotify

## 📌 Objetivo

Desenvolver uma API REST utilizando **Spring Boot** para simular funcionalidades básicas de uma plataforma de streaming de música, inspirada no Spotify.

A aplicação deverá permitir o gerenciamento de usuários, artistas, álbuns, músicas e playlists, além de implementar algumas regras de negócio além do CRUD tradicional.

---

# 📦 Requisitos Funcionais

A aplicação deverá conter **5 entidades principais**:

- Usuário  
- Artista  
- Álbum  
- Música  
- Playlist

- E mais uma entidade que vocês pensarem, pode ser qualquer coisa que faça sentido a aplicação. 

Todas devem possuir CRUD completo.

---

# 🗂 Entidades e Atributos

## 1️⃣ Usuário

Representa um usuário da plataforma.

**Atributos:**

- `id` (Long)
- `nome` (String)
- `email` (String)
- `tipoPlano` (ENUM: FREE, PREMIUM)
- `ativo` (boolean)
- `dataCriacao` (LocalDateTime)

---

## 2️⃣ Artista

Representa o artista ou banda.

**Atributos:**

- `id` (Long)
- `nome` (String)
- `generoMusical` (String)
- `paisOrigem` (String)

---

## 3️⃣ Álbum

Representa um álbum musical.

**Atributos:**

- `id` (Long)
- `titulo` (String)
- `dataLancamento` (LocalDate)
- `artista` (ManyToOne)

---

## 4️⃣ Música

Representa uma música disponível na plataforma.

**Atributos:**

- `id` (Long)
- `titulo` (String)
- `duracaoSegundos` (Integer)
- `numeroFaixa` (Integer)
- `album` (ManyToOne)
- `artista` (ManyToOne)
- `totalReproducoes` (Long)

---

## 5️⃣ Playlist

Representa uma playlist criada por um usuário.

**Atributos:**

- `id` (Long)
- `nome` (String)
- `publica` (boolean)
- `dataCriacao` (LocalDateTime)
- `usuario` (ManyToOne)
- `musicas` (ManyToMany)

---

# 🔗 Relacionamentos Esperados

- Um **Artista** pode ter vários **Álbuns** (1:N)
- Um **Álbum** pode ter várias **Músicas** (1:N)
- Um **Usuário** pode ter várias **Playlists** (1:N)
- Uma **Playlist** pode conter várias **Músicas** (N:N)

---

# 🌐 Rotas Obrigatórias (CRUD)

Para todas as entidades, implementar:

### Exemplo para Usuário:

- `POST /usuarios`
- `GET /usuarios`
- `GET /usuarios/{id}`
- `PUT /usuarios/{id}`
- `DELETE /usuarios/{id}` -> as exclusões devem ser lógicas, e nada excluído deve ser usado, por exemploo, um usuário excluído não pode criar uma playlist.



O mesmo padrão deve ser aplicado para:

- `artistas`
- `albuns`
- `musicas`
- `playlists`

---

# 🚀 Rotas com Regra de Negócio (Obrigatórias)

Além do CRUD, a aplicação deverá implementar as seguintes funcionalidades:

---

## 1️⃣ Reproduzir Música

### Endpoint:

POST /musicas/{id}/reproduzir

### Regras:

- Deve incrementar o campo `totalReproducoes`.
- O usuário que está realizando a ação deve ser informado via header:

X-USER-ID: {idUsuario}

- Se o usuário estiver inativo, a reprodução deve ser bloqueada.

---

## 2️⃣ Adicionar Música à Playlist

### Endpoint:

POST /playlists/{playlistId}/musicas/{musicaId}

### Regras:

- Apenas o dono da playlist pode adicionar músicas.
- Não permitir adicionar a mesma música duas vezes na mesma playlist.
- Caso a playlist não exista, retornar erro apropriado.

---

## 3️⃣ Top 10 Músicas Mais Reproduzidas

### Endpoint:

GET /relatorios/top-musicas


### Regras:

- Retornar as 10 músicas com maior número de reproduções.
- Ordenação decrescente.
- Retornar apenas:
  - título da música
  - nome do artista
  - total de reproduções

**Dica:** utilizar DTO para retorno personalizado.

---

# 📌 Requisitos Técnicos

A aplicação deve:

- Utilizar Spring Boot
- Implementar camadas:
  - Controller
  - Service]
- Utilizar DTOs para entrada e saída de dados
- Utilizar validações com Bean Validation (`@NotNull`, `@Email`, etc.)

---

# 📊 Critérios de Avaliação

- Modelagem correta das entidades e relacionamentos
- Organização do projeto
- Implementação correta do CRUD
- Implementação correta das regras de negócio
- Boas práticas REST
- Clareza e organização do código

---

# 🎯 Entrega

- Projeto funcional
- Código organizado
- README explicando como rodar a aplicação
- Coleção Postman
- Data: 17/03
- Onde: BlackBoard - Entrega 2
