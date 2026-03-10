package br.insper.consulta;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class MedicoController {


    private MedicoService medicoService = new MedicoService();

    @GetMapping("/medico")
    public Collection<Medico> getMedicos() {
        return medicoService.listarMedicos();
    }

    @PostMapping("/medico")
    public Medico saveMedico(@RequestBody Medico medico) {
        return medicoService.cadastrarMedico(medico);
    }

    @GetMapping("/medico/{crm}")
    public Medico getMedico(@PathVariable String crm) {
        return medicoService.getMedico(crm);
    }

    @DeleteMapping("/medico/{id}")
    public void deleteMedico(@PathVariable String id) {
        medicoService.deleteMedico(id);
    }


}
