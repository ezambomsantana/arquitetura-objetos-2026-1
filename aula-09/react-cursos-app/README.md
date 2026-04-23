# Gestor de Cursos

Projeto simples em React para consumir a API de cursos via `fetch`.

## Páginas

- `/cursos` - listagem de cursos
- `/cursos/novo` - criação de curso
- `/cursos/:codigo` - detalhes de um curso específico

## API usada

Baseada no OpenAPI enviado, especialmente estes endpoints:

- `POST /curso`
- `GET /curso`
- `GET /curso/{codigo}`

A listagem usa paginação com `page` e `size`, além de filtro opcional por `nome` e `nivel`.

## Como rodar

```bash
npm install
npm run dev
```

Se o back-end não estiver em `http://localhost:8080`, ajuste a variável:

```bash
VITE_API_BASE_URL=http://localhost:8080
```
