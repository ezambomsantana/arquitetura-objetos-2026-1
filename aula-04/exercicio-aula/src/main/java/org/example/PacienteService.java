package org.example;

import java.util.Collection;
import java.util.HashMap;

public class PacienteService {

    private HashMap<String, Paciente> pacientes = new HashMap<>();

    public boolean cadastrarPaciente(String nome, String cpf,
                                  int idade, String endereco) {
        if (pacientes.containsKey(cpf)) {
            System.out.println("Paciente já existe");
            return false;
        }

        if (nome == null || cpf == null || idade < 0) {
            System.out.println("Dados inválidos");
            return false;
        }

        Paciente paciente = new Paciente(nome, cpf, idade, endereco);
        pacientes.put(cpf, paciente);
        return true;
    }

    public Collection<Paciente> listarPacientes() {
        for (Paciente paciente : pacientes.values()) {
            paciente.imprime();
        }
        return pacientes.values();
    }

    public Paciente buscarPaciente(String cpf) {
        return pacientes.get(cpf);
    }
}
