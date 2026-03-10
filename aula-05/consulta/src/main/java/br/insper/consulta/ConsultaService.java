package br.insper.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

@Service
public class ConsultaService {

    private HashMap<String, Consulta> consultas = new HashMap<>();

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private MedicoService medicoService;

    public Consulta cadastrarConsulta(Consulta consulta) {

        if (consulta.getPaciente() != null) {

            Paciente paciente = pacienteService
                    .buscarPaciente(consulta.getPaciente().getCpf());

            Medico medico = medicoService
                    .getMedico(consulta.getMedico().getCrm());

            consulta.setId(UUID.randomUUID().toString());
            consultas.put(consulta.getId(), consulta);
            return consulta;
        }
        throw new RuntimeException("Paciente não pode ser nulo");
    }

    public Collection<Consulta> listarConsultas() {
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

