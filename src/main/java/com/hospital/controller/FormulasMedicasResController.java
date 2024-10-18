package com.hospital.controller;

import com.hospital.controller.request.EspecialidadesRequest;
import com.hospital.controller.request.FormulasMedicasRequest;
import com.hospital.controller.response.EspecialidadesResponse;
import com.hospital.controller.response.FormulasMedicasResponse;
import com.hospital.entitys.Especialidades;
import com.hospital.entitys.FormulasMedicas;
import com.hospital.services.service.EspecialidadesService;
import com.hospital.services.service.FormulasMedicasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/formulasmedicas")
@RequiredArgsConstructor
public class FormulasMedicasResController {
    private  final FormulasMedicasService formulasMedicasService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<FormulasMedicas>> listFormulasMedicasApi(){
        List<FormulasMedicas> formulasMedicasList = formulasMedicasService.listarFormulasMedicas();
        return new ResponseEntity<>(formulasMedicasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedFormulasMedicasApi(@RequestParam(name = "id")Long id){
        formulasMedicasService.eliminarFormulasMedicas(id);
        return ResponseEntity.accepted().body("Formula Medica eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<FormulasMedicasResponse> SearchFormulasMedicasApi(@PathVariable Long id){
        FormulasMedicasResponse formulasMedicasResponse = formulasMedicasService.consultarFormulasMedicas(id);
        return ResponseEntity.accepted().body(formulasMedicasResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveFormulasMedicasApi(@RequestBody FormulasMedicasRequest formulasMedicasRequest){
        formulasMedicasService.guardarFormulasMedicas(formulasMedicasRequest);
        return ResponseEntity.accepted().body("Formula Medica Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateFormulasMedicasApi(@RequestBody FormulasMedicasRequest formulasMedicasRequest ){
        formulasMedicasService.actualizarFormulasMedicas(formulasMedicasRequest);
        return ResponseEntity.accepted().body("Formula Medica Actualizada");

    }
}
