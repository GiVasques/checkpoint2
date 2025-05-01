package br.com.fiap.checkpoint2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public Paciente createPaciente (PacienteRequestCreate dto) {
        return pacienteRepository.save(dto.toModel());
    }
}
