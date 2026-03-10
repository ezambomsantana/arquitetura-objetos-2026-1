package br.insper.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/consulta")
    public Collection<Consulta> getConsultas() {
        return consultaService.listarConsultas();
    }

    @PostMapping("/consulta")
    public Consulta saveConsulta(@RequestBody Consulta consulta) {
        return consultaService.cadastrarConsulta(consulta);
    }

    @GetMapping("/consulta/{id}")
    public Consulta getConsulta(@PathVariable String id) {
        return consultaService.getConsulta(id);
    }

    @DeleteMapping("/consulta/{id}")
    public void deleteConsulta(@PathVariable String id) {
        consultaService.deleteConsulta(id);
    }


}
