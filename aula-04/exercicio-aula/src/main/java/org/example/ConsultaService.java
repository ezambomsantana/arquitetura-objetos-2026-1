package org.example;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class ConsultaService {

    private HashMap<String, Consulta> consultas = new HashMap<>();

    public boolean cadastrarConsulta(Paciente paciente) {
        if (paciente != null) {
            Consulta consulta = new Consulta();
            consulta.setPaciente(paciente);
            consulta.setData(LocalDateTime.now().plusDays(5));
            consulta.setId(UUID.randomUUID().toString());
            consultas.put(consulta.getId(), consulta);
            return true;
        }
        return false;
    }

    public Collection<Consulta> listarConsultas() {
        for (Consulta consulta : consultas.values()) {
            consulta.imprime();
        }
        return consultas.values();
    }

}
