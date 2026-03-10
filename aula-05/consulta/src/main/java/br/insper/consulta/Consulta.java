package br.insper.consulta;

import java.time.LocalDateTime;

public class Consulta {

    private String id;
    private Paciente paciente;
    private Medico medico;
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

        System.out.format("### Consulta: %s \n", id);
        System.out.format("Paciente: %s \n", paciente.getNome());
        System.out.format("Data: %s \n", data);

    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
