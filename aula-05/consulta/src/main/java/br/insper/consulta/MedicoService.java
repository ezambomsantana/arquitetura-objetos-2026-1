package br.insper.consulta;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

@Service
public class MedicoService {

    private HashMap<String, Medico> medicos = new HashMap<>();

    public Medico cadastrarMedico(Medico medico) {

        if (medico.getCrm() == null || medico.getNome() == null) {
            throw new RuntimeException("Paciente não pode ser nulo");
        }
        medicos.put(medico.getCrm(), medico);
        return medico;
    }

    public Collection<Medico> listarMedicos() {
        return medicos.values();
    }

    public Medico getMedico(String crm) {
        Medico medico = medicos.get(crm);
        if (medico == null) {
            throw new RuntimeException("Médico não encontrado");
        }
        return medico;
    }

    public void deleteMedico(String crm) {
        Medico medico = getMedico(crm);
        medicos.remove(crm);
    }
}
