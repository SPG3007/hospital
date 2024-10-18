package com.hospital.services.service;

import com.hospital.controller.request.PersonaRequest;
import com.hospital.controller.response.PersonaResponse;
import com.hospital.entitys.Personas;

import java.util.List;

public interface PersonaService {

    List<Personas>getListPersonas();
    void deletePerson(Long id);
    PersonaResponse searchPerson(Long id);
    void savePerson(PersonaRequest personaRequest);
    void updatePerson(PersonaRequest personaRequest);
}
