import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { createCurso } from '../api';

const NIVEL_OPTIONS = ['TECNOLOGO', 'GRADUACAO', 'POS_GRADUACAO', 'MESTRADO', 'DOUTORADO'];

export default function CreateCoursePage() {
  const navigate = useNavigate();
  const [form, setForm] = useState({
    codigo: '',
    nome: '',
    descricao: '',
    nivel: 'GRADUACAO',
  });
  const [saving, setSaving] = useState(false);
  const [error, setError] = useState('');

  function updateField(field, value) {
    setForm((current) => ({ ...current, [field]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    setSaving(true);
    setError('');

    try {
      const payload = {
        codigo: form.codigo || undefined,
        nome: form.nome,
        descricao: form.descricao || undefined,
        nivel: form.nivel,
      };

      const created = await createCurso(payload);
      navigate(`/cursos/${created.codigo}`);
    } catch (err) {
      setError(err.message || 'Não foi possível criar o curso');
    } finally {
      setSaving(false);
    }
  }

  return (
    <section className="panel narrow">
      <h2>Criar curso</h2>
      <form className="form" onSubmit={handleSubmit}>
        <label>
          Código
          <input value={form.codigo} onChange={(e) => updateField('codigo', e.target.value)} placeholder="Ex.: ADS01" />
        </label>
        <label>
          Nome
          <input required value={form.nome} onChange={(e) => updateField('nome', e.target.value)} placeholder="Ex.: Análise e Desenvolvimento de Sistemas" />
        </label>
        <label>
          Descrição
          <textarea rows="4" value={form.descricao} onChange={(e) => updateField('descricao', e.target.value)} placeholder="Descrição do curso" />
        </label>
        <label>
          Nível
          <select value={form.nivel} onChange={(e) => updateField('nivel', e.target.value)}>
            {NIVEL_OPTIONS.map((nivel) => (
              <option key={nivel} value={nivel}>{nivel}</option>
            ))}
          </select>
        </label>

        {error && <p className="alert error">{error}</p>}

        <button className="button primary" type="submit" disabled={saving}>
          {saving ? 'Salvando...' : 'Criar curso'}
        </button>
      </form>
    </section>
  );
}
