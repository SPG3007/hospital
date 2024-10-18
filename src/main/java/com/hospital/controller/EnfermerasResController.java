package com.hospital.controller;

import com.hospital.controller.request.DoctoresRequest;
import com.hospital.controller.request.EnfermerasRequest;
import com.hospital.controller.response.DoctoresResponse;
import com.hospital.controller.response.EnfermerasResponse;
import com.hospital.entitys.Doctores;
import com.hospital.entitys.Enfermeras;
import com.hospital.services.service.DoctoresService;
import com.hospital.services.service.EnfermerasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/enfermeras")
@RequiredArgsConstructor
public class EnfermerasResController {

    private  final EnfermerasService enfermerasService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Enfermeras>> listEnfermerasApi(){
        List<Enfermeras> enfermerasList = enfermerasService.listarEnfermeras();
        return new ResponseEntity<>(enfermerasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedEnfermerasApi(@RequestParam(name = "id")Long id){
        enfermerasService.eliminarEnfermeras(id);
        return ResponseEntity.accepted().body("Enfermera eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<EnfermerasResponse> SearchEnfermerasApi(@PathVariable Long id){
        EnfermerasResponse enfermerasResponse = enfermerasService.consultarEnfermeras(id);
        return ResponseEntity.accepted().body(enfermerasResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveEnfermerasApi(@RequestBody EnfermerasRequest enfermerasRequest){
        enfermerasService.guardarEnfermeras(enfermerasRequest);
        return ResponseEntity.accepted().body("Enfermera Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateEnfermerasApi(@RequestBody EnfermerasRequest enfermerasRequest ){
        enfermerasService.actualizarEnfermeras(enfermerasRequest);
        return ResponseEntity.accepted().body("Enfermera Actualizada");

    }
}
