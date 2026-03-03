package org.example;

import java.time.LocalDateTime;

public class Consulta {

    private String id;
    private Paciente paciente;
    private LocalDateTime data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void imprime() {

        System.out.println("### Consulta: " + id);
        System.out.format("Paciente: %s", paciente.getNome());
        System.out.format("Data: %s" + data);

    }
}
