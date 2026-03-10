package br.insper.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/paciente")
    public Collection<Paciente> getPacientes(
            @RequestParam(name = "idade",required = false) Integer idade) {
        return pacienteService.listarPacientes(idade);
    }

    @GetMapping("/paciente/{cpf}")
    public Paciente getPaciente(@PathVariable String cpf) {
        return pacienteService.buscarPaciente(cpf);
    }

    @PostMapping("/paciente")
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente postPacientes(@RequestBody Paciente paciente) {
        return pacienteService.cadastrarPaciente(paciente);
    }

    @DeleteMapping("/paciente/{cpf}")
    public void deletePaciente(@PathVariable String cpf) {
        pacienteService.deletePaciente(cpf);
    }

}
