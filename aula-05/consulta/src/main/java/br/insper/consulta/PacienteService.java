package br.insper.consulta;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@Service
public class PacienteService {

    private HashMap<String, Paciente> pacientes = new HashMap<>();

    public Paciente cadastrarPaciente(Paciente paciente) {
        if (pacientes.containsKey(paciente.getCpf())) {
            System.out.println("Paciente já existe");
            throw new RuntimeException("Paciente já existe");
        }

        if (paciente.getNome() == null || paciente.getCpf() == null
                || paciente.getIdade() < 0) {
            throw new RuntimeException("Dados inválidos");
        }

        pacientes.put(paciente.getCpf(), paciente);
        return paciente;
    }

    public Collection<Paciente> listarPacientes(Integer idade) {
        if (idade != null) {

            Collection<Paciente> resposta = new ArrayList<>();
            for (Paciente paciente : pacientes.values()) {
                if (paciente.getIdade() > idade) {
                    resposta.add(paciente);
                }
            }
            return resposta;
        } else {
            return pacientes.values();
        }

    }

    public Paciente buscarPaciente(String cpf) {
        Paciente paciente = pacientes.get(cpf);
        if (paciente == null) {
            throw new RuntimeException("Paciente nao encontrado");
        }
        return paciente;
    }

    public void deletePaciente(String cpf) {
        Paciente paciente = buscarPaciente(cpf);
        pacientes.remove(cpf);
    }




    /*
    private static PacienteService pacienteService;

    public static PacienteService getInstance() {
        if (pacienteService == null) {
            pacienteService = new PacienteService();
        }
        return pacienteService;
    }

    private PacienteService() {

    }

 */
}
