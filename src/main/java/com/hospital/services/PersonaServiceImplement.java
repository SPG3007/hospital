package com.hospital.services;

import com.hospital.entitys.Personas;
import com.hospital.entitys.repositiry.PersonaRepository;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaServiceImplement implements PersonaService {

    private final PersonaRepository personaRepository;


    @Override
    public List<Personas> getListPersonas() {
        return personaRepository.listPersonas();
    }
}
