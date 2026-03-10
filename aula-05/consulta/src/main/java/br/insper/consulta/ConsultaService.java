package br.insper.consulta;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class ConsultaService {

    private HashMap<String, Consulta> consultas = new HashMap<>();

    public Consulta cadastrarConsulta(Consulta consulta) {
        if (consulta.getPaciente() != null) {
            consulta.setId(UUID.randomUUID().toString());
            consultas.put(consulta.getId(), consulta);
            return consulta;
        }
        throw new RuntimeException("Paciente não pode ser nulo");
    }

    public Collection<Consulta> listarConsultas() {
        for (Consulta consulta : consultas.values()) {
            consulta.imprime();
        }
        return consultas.values();
    }

    public Consulta getConsulta(String id) {
        Consulta consulta = consultas.get(id);
        if (consulta == null) {
            throw new RuntimeException("Consulta não encontrada");
        }
        return consulta;
    }

    public void deleteConsulta(String id) {
        Consulta consulta = getConsulta(id);
        consultas.remove(id);
    }
}

