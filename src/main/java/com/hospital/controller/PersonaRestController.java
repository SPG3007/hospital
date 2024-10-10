package com.hospital.controller;


import com.hospital.entitys.Personas;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "v1/personas")
@RequiredArgsConstructor
public class PersonaRestController {

    private  final PersonaService personaService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Personas>> listPersonasApi(){
        List<Personas> personasList = personaService.getListPersonas();
        return new ResponseEntity<>(personasList, HttpStatus.ACCEPTED);

    }
}
