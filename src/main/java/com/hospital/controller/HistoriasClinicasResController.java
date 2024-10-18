package com.hospital.controller;

import com.hospital.controller.request.FormulasMedicasRequest;
import com.hospital.controller.request.HistoriasClinicasRequest;
import com.hospital.controller.response.FormulasMedicasResponse;
import com.hospital.controller.response.HistoriasClinicasResponse;
import com.hospital.entitys.FormulasMedicas;
import com.hospital.entitys.HistoriasClinicas;
import com.hospital.services.service.FormulasMedicasService;
import com.hospital.services.service.HistoriasClinicasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/hitoriasclinicas")
@RequiredArgsConstructor
public class HistoriasClinicasResController {
    private  final HistoriasClinicasService historiasClinicasService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<HistoriasClinicas>> listHistoriasClinicasApi(){
        List<HistoriasClinicas> historiasClinicasList = historiasClinicasService.listarHistoriasClinicas();
        return new ResponseEntity<>(historiasClinicasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedHistoriasClinicasApi(@RequestParam(name = "id")Long id){
        historiasClinicasService.eliminarHistoriasClinicas(id);
        return ResponseEntity.accepted().body("Historia Clinica eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<HistoriasClinicasResponse> SearchHistoriasClinicasApi(@PathVariable Long id){
        HistoriasClinicasResponse historiasClinicasResponse = historiasClinicasService.consultarHistoriasClinicas(id);
        return ResponseEntity.accepted().body(historiasClinicasResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveHistoriasClinicasApi(@RequestBody HistoriasClinicasRequest historiasClinicasRequest){
        historiasClinicasService.guardarHistoriasClinicas(historiasClinicasRequest);
        return ResponseEntity.accepted().body("Historia Clinica Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateHistoriasClinicasApi(@RequestBody HistoriasClinicasRequest historiasClinicasRequest ){
        historiasClinicasService.actualizarHistoriasClinicas(historiasClinicasRequest);
        return ResponseEntity.accepted().body("Historia Clinica Actualizada");

    }
}
