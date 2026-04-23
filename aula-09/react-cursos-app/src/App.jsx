import { Link, Navigate, Route, Routes } from 'react-router-dom';
import CreateCoursePage from './pages/CreateCoursePage';
import CoursesListPage from './pages/CoursesListPage';
import CourseDetailPage from './pages/CourseDetailPage';

function Layout({ children }) {
  return (
    <div className="app-shell">
      <header className="topbar">
        <div>
          <h1>Gestor de Cursos</h1>
          <p>Base inicial em React consumindo a API via fetch</p>
        </div>
        <nav className="nav">
          <Link to="/cursos">Cursos</Link>
          <Link to="/cursos/novo">Novo curso</Link>
        </nav>
      </header>
      <main className="content">{children}</main>
    </div>
  );
}

export default function App() {
  return (
    <Layout>
      <Routes>
        <Route path="/" element={<Navigate to="/cursos" replace />} />
        <Route path="/cursos" element={<CoursesListPage />} />
        <Route path="/cursos/novo" element={<CreateCoursePage />} />
        <Route path="/cursos/:codigo" element={<CourseDetailPage />} />
      </Routes>
    </Layout>
  );
}
