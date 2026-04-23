import { useEffect, useMemo, useState } from 'react';
import { Link } from 'react-router-dom';
import { listCursos } from '../api';

const NIVEL_OPTIONS = [
  { value: '', label: 'Todos' },
  { value: 'TECNOLOGO', label: 'Tecnólogo' },
  { value: 'GRADUACAO', label: 'Graduação' },
  { value: 'POS_GRADUACAO', label: 'Pós-graduação' },
  { value: 'MESTRADO', label: 'Mestrado' },
  { value: 'DOUTORADO', label: 'Doutorado' },
];

export default function CoursesListPage() {
  const [items, setItems] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState('');
  const [nome, setNome] = useState('');
  const [nivel, setNivel] = useState('');
  const [page, setPage] = useState(0);
  const [pageInfo, setPageInfo] = useState({ totalPages: 0, totalElements: 0 });

  const query = useMemo(() => ({ nome, nivel, page, size: 10 }), [nome, nivel, page]);

  useEffect(() => {
    let active = true;

    async function load() {
      setLoading(true);
      setError('');
      try {
        const data = await listCursos(query);
        if (!active) return;
        setItems(data?.content ?? []);
        setPageInfo({
          totalPages: data?.totalPages ?? 0,
          totalElements: data?.totalElements ?? 0,
        });
      } catch (err) {
        if (!active) return;
        setError(err.message || 'Falha ao carregar cursos');
      } finally {
        if (active) setLoading(false);
      }
    }

    load();
    return () => {
      active = false;
    };
  }, [query]);

  function submitFilter(event) {
    event.preventDefault();
    setPage(0);
  }

  return (
    <section className="panel">
      <div className="panel-header">
        <div>
          <h2>Listagem de cursos</h2>
          <p>Use o link de detalhes para abrir a página do curso específico.</p>
        </div>
        <Link className="button primary" to="/cursos/novo">Criar curso</Link>
      </div>

      <form className="filters" onSubmit={submitFilter}>
        <label>
          Nome
          <input value={nome} onChange={(e) => setNome(e.target.value)} placeholder="Ex.: Engenharia" />
        </label>
        <label>
          Nível
          <select value={nivel} onChange={(e) => setNivel(e.target.value)}>
            {NIVEL_OPTIONS.map((option) => (
              <option key={option.value} value={option.value}>{option.label}</option>
            ))}
          </select>
        </label>
        <button className="button" type="submit">Filtrar</button>
      </form>

      {loading && <p>Carregando cursos...</p>}
      {error && <p className="alert error">{error}</p>}

      {!loading && !error && (
        <>
          <p className="summary">Total: {pageInfo.totalElements}</p>
          <div className="table-wrapper">
            <table>
              <thead>
                <tr>
                  <th>Código</th>
                  <th>Nome</th>
                  <th>Nível</th>
                  <th>Descrição</th>
                  <th></th>
                </tr>
              </thead>
              <tbody>
                {items.length === 0 ? (
                  <tr>
                    <td colSpan="5">Nenhum curso encontrado.</td>
                  </tr>
                ) : (
                  items.map((curso) => (
                    <tr key={curso.codigo}>
                      <td>{curso.codigo}</td>
                      <td>{curso.nome}</td>
                      <td>{curso.nivel}</td>
                      <td>{curso.descricao || '-'}</td>
                      <td>
                        <Link to={`/cursos/${curso.codigo}`}>Ver detalhes</Link>
                      </td>
                    </tr>
                  ))
                )}
              </tbody>
            </table>
          </div>

          <div className="pagination">
            <button className="button" disabled={page === 0} onClick={() => setPage((p) => p - 1)} type="button">
              Anterior
            </button>
            <span>Página {page + 1} de {Math.max(pageInfo.totalPages, 1)}</span>
            <button className="button" disabled={page + 1 >= pageInfo.totalPages} onClick={() => setPage((p) => p + 1)} type="button">
              Próxima
            </button>
          </div>
        </>
      )}
    </section>
  );
}
