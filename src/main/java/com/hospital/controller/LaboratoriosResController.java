package com.hospital.controller;

import com.hospital.controller.request.EnfermerasRequest;
import com.hospital.controller.request.LaboratoriosRequest;
import com.hospital.controller.response.EnfermerasResponse;
import com.hospital.controller.response.LaboratoriosResponse;
import com.hospital.entitys.Enfermeras;
import com.hospital.entitys.Laboratorios;
import com.hospital.services.service.EnfermerasService;
import com.hospital.services.service.LaboratoriosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/laboratorios")
@RequiredArgsConstructor
public class LaboratoriosResController {
    private  final LaboratoriosService laboratoriosService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Laboratorios>> listEnfermerasApi(){
        List<Laboratorios> laboratoriosList = laboratoriosService.listarLaboratorios();
        return new ResponseEntity<>(laboratoriosList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedLaboratoriosApi(@RequestParam(name = "id")Long id){
        laboratoriosService.eliminarLaboratorios(id);
        return ResponseEntity.accepted().body("Laboratorio eliminado");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<LaboratoriosResponse> SearchLaboratoriosApi(@PathVariable Long id){
        LaboratoriosResponse laboratoriosResponse = laboratoriosService.consultarLaboratorios(id);
        return ResponseEntity.accepted().body(laboratoriosResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveLaboratoriosApi(@RequestBody LaboratoriosRequest laboratoriosRequest){
        laboratoriosService.guardarLaboratorios(laboratoriosRequest);
        return ResponseEntity.accepted().body("Laboratorio Guardado");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateLaboratoriosApi(@RequestBody LaboratoriosRequest laboratoriosRequest ){
        laboratoriosService.actualizarLaboratorios(laboratoriosRequest);
        return ResponseEntity.accepted().body("Laboratorio Actualizado");

    }
}
