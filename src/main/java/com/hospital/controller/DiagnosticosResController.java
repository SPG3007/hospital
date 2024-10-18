package com.hospital.controller;

import com.hospital.controller.request.CitasRequest;
import com.hospital.controller.request.DiagnosticosRequest;
import com.hospital.controller.response.CitasResponse;
import com.hospital.controller.response.DiagnosticosResponse;
import com.hospital.entitys.Citas;
import com.hospital.entitys.Diagnosticos;
import com.hospital.services.service.CitasService;
import com.hospital.services.service.DiagnosticosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/diagnosticos")
@RequiredArgsConstructor
public class DiagnosticosResController {

    private  final DiagnosticosService diagnosticosService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Diagnosticos>> listDiagnosticosApi(){
        List<Diagnosticos> diagnosticosList = diagnosticosService.listarDiagnosticos();
        return new ResponseEntity<>(diagnosticosList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedDiagnosticosApi(@RequestParam(name = "id")Long id){
        diagnosticosService.eliminarDiagnosticos(id);
        return ResponseEntity.accepted().body("Diagnostico eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<DiagnosticosResponse> SearchDiagnosticosApi(@PathVariable Long id){
        DiagnosticosResponse diagnosticosResponse = diagnosticosService.consultarDiagnosticos(id);
        return ResponseEntity.accepted().body(diagnosticosResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveDiagnosticosApi(@RequestBody DiagnosticosRequest diagnosticosRequest){
        diagnosticosService.guardarDiagnosticos(diagnosticosRequest);
        return ResponseEntity.accepted().body("Diagnostico Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateDiagnosticosApi(@RequestBody DiagnosticosRequest diagnosticosRequest ){
        diagnosticosService.actualizarDiagnosticos(diagnosticosRequest);
        return ResponseEntity.accepted().body("Diagnostico Actualizada");

    }
}
