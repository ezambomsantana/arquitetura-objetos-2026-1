const API_BASE_URL = import.meta.env.VITE_API_BASE_URL ?? '/api';

async function request(path, options = {}) {
  const response = await fetch(`${API_BASE_URL}${path}`, {
    headers: {
      'Content-Type': 'application/json',
      ...(options.headers ?? {}),
    },
    ...options,
  });

  const contentType = response.headers.get('content-type') || '';
  const hasJson = contentType.includes('application/json');
  const data = hasJson ? await response.json().catch(() => null) : null;

  if (!response.ok) {
    const message = data?.mensagem || data?.message || `Erro HTTP ${response.status}`;
    throw new Error(message);
  }

  return data;
}

export function listCursos({ nome = '', nivel = '', page = 0, size = 10 } = {}) {
  const params = new URLSearchParams();
  params.set('page', String(page));
  params.set('size', String(size));
  if (nome) params.set('nome', nome);
  if (nivel) params.set('nivel', nivel);

  return request(`/curso?${params.toString()}`);
}

export function getCurso(codigo) {
  return request(`/curso/${encodeURIComponent(codigo)}`);
}

export function createCurso(payload) {
  return request('/curso', {
    method: 'POST',
    body: JSON.stringify(payload),
  });
}
