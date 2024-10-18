package com.hospital.controller;

import com.hospital.controller.request.DiagnosticosRequest;
import com.hospital.controller.request.DoctoresRequest;
import com.hospital.controller.response.DiagnosticosResponse;
import com.hospital.controller.response.DoctoresResponse;
import com.hospital.entitys.Diagnosticos;
import com.hospital.entitys.Doctores;
import com.hospital.services.service.DiagnosticosService;
import com.hospital.services.service.DoctoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/doctores")
@RequiredArgsConstructor
public class DoctoresResController {
    private  final DoctoresService doctoresService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Doctores>> listDoctoresApi(){
        List<Doctores> doctoresList = doctoresService.listarDoctores();
        return new ResponseEntity<>(doctoresList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedDoctoresApi(@RequestParam(name = "id")Long id){
        doctoresService.eliminarDoctores(id);
        return ResponseEntity.accepted().body("Doctor eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<DoctoresResponse> SearchDoctoresApi(@PathVariable Long id){
        DoctoresResponse doctoresResponse = doctoresService.consultarDoctores(id);
        return ResponseEntity.accepted().body(doctoresResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveDoctoresApi(@RequestBody DoctoresRequest doctoresRequest){
        doctoresService.guardarDoctores(doctoresRequest);
        return ResponseEntity.accepted().body("Doctor Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateDoctoresApi(@RequestBody DoctoresRequest doctoresRequest ){
        doctoresService.actualizarDoctores(doctoresRequest);
        return ResponseEntity.accepted().body("Doctor Actualizada");

    }
}
