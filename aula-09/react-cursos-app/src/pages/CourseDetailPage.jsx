import { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import { getCurso } from '../api';

function formatDate(value) {
  if (!value) return '-';
  try {
    return new Intl.DateTimeFormat('pt-BR', {
      dateStyle: 'short',
      timeStyle: 'short',
    }).format(new Date(value));
  } catch {
    return value;
  }
}

export default function CourseDetailPage() {
  const { codigo } = useParams();
  const [curso, setCurso] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState('');

  useEffect(() => {
    let active = true;

    async function load() {
      setLoading(true);
      setError('');
      try {
        const data = await getCurso(codigo);
        if (active) setCurso(data);
      } catch (err) {
        if (active) setError(err.message || 'Falha ao carregar curso');
      } finally {
        if (active) setLoading(false);
      }
    }

    load();
    return () => {
      active = false;
    };
  }, [codigo]);

  return (
    <section className="panel narrow">
      <div className="panel-header">
        <div>
          <h2>Detalhes do curso</h2>
          <p>Curso identificado por: {codigo}</p>
        </div>
        <Link className="button" to="/cursos">Voltar</Link>
      </div>

      {loading && <p>Carregando detalhes...</p>}
      {error && <p className="alert error">{error}</p>}

      {!loading && !error && curso && (
        <div className="details">
          <div><strong>Código:</strong> {curso.codigo}</div>
          <div><strong>Nome:</strong> {curso.nome}</div>
          <div><strong>Descrição:</strong> {curso.descricao || '-'}</div>
          <div><strong>Nível:</strong> {curso.nivel}</div>
          <div><strong>Criado em:</strong> {formatDate(curso.dataCriacao)}</div>
          <div><strong>Atualizado em:</strong> {formatDate(curso.dataAtualizacao)}</div>
        </div>
      )}
    </section>
  );
}
