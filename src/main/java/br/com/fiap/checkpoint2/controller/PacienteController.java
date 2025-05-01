package br.com.fiap.checkpoint2.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint2.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint2.dto.PacienteResponse;
import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.service.PacienteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping ("pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity <PacienteResponse> createPaciente (@RequestBody PacienteRequestCreate dto) {
        System.out.println("teste: " + dto.getNome());
        return ResponseEntity.status(201).body(
            new PacienteResponse().toDto(pacienteService.createPaciente(dto))
        );
    }

    @PutMapping ("/{id}")
    public ResponseEntity <PacienteResponse> updatePaciente (@RequestBody PacienteRequestUpdate dto, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <PacienteResponse> deletePaciente (@PathVariable Long id) {
        return null;
    }

    @GetMapping ("/{id}")
    public ResponseEntity <PacienteResponse> getPacienteById (@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity <PacienteResponse> getAll () {
        return null;
    }
}
