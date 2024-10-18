package com.hospital.controller;


import com.hospital.controller.request.PersonaRequest;
import com.hospital.controller.response.PersonaResponse;
import com.hospital.entitys.Personas;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/personas")
@RequiredArgsConstructor
public class PersonaRestController {

    private  final PersonaService personaService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Personas>> listPersonasApi(){
        List<Personas> personasList = personaService.getListPersonas();
        return new ResponseEntity<>(personasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedPersonasApi(@RequestParam(name = "id")Long id){
        personaService.deletePerson(id);
        return ResponseEntity.accepted().body("Persona eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<PersonaResponse> SearchPersonasApi(@PathVariable Long id){
        PersonaResponse personaResponse = personaService.searchPerson(id);
        return ResponseEntity.accepted().body(personaResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SavePersonasApi(@RequestBody PersonaRequest personaRequest){
        personaService.savePerson(personaRequest);
        return ResponseEntity.accepted().body("Persona Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdatePersonasApi(@RequestBody PersonaRequest personaRequest ){
        personaService.updatePerson(personaRequest);
        return ResponseEntity.accepted().body("Persona Actualizada");

    }
}
