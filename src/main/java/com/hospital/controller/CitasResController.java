package com.hospital.controller;

import com.hospital.controller.request.CitasRequest;
import com.hospital.controller.request.PersonaRequest;
import com.hospital.controller.response.CitasResponse;
import com.hospital.controller.response.PersonaResponse;
import com.hospital.entitys.Citas;
import com.hospital.entitys.Personas;
import com.hospital.services.service.CitasService;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/citas")
@RequiredArgsConstructor

public class CitasResController {

    private  final CitasService citasService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Citas>> listCitasApi(){
        List<Citas> citasList = citasService.listarCitas();
        return new ResponseEntity<>(citasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedCitasApi(@RequestParam(name = "id")Long id){
        citasService.eliminarCitas(id);
        return ResponseEntity.accepted().body("Cita eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<CitasResponse> SearchCitasApi(@PathVariable Long id){
        CitasResponse citasResponse = citasService.consultarCitas(id);
        return ResponseEntity.accepted().body(citasResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveCitasApi(@RequestBody CitasRequest citasRequest){
        citasService.guardarCitas(citasRequest);
        return ResponseEntity.accepted().body("Cita Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateCitasApi(@RequestBody CitasRequest citasRequest ){
        citasService.actualizarCitas(citasRequest);
        return ResponseEntity.accepted().body("Cita Actualizada");

    }
}
