package com.hospital.controller;

import com.hospital.controller.request.LaboratoriosRequest;
import com.hospital.controller.request.MedicamentosRequest;
import com.hospital.controller.response.LaboratoriosResponse;
import com.hospital.controller.response.MedicamentosResponse;
import com.hospital.entitys.Laboratorios;
import com.hospital.entitys.Medicamentos;
import com.hospital.services.service.LaboratoriosService;
import com.hospital.services.service.MedicamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/medicamentos")
@RequiredArgsConstructor
public class MedicamentosResController {
    private  final MedicamentosService medicamentosService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Medicamentos>> listEnfermerasApi(){
        List<Medicamentos> medicamentosList = medicamentosService.listarMedicamentos();
        return new ResponseEntity<>(medicamentosList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedMedicamentosApi(@RequestParam(name = "id")Long id){
        medicamentosService.eliminarMedicamentos(id);
        return ResponseEntity.accepted().body("Medicamento eliminado");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<MedicamentosResponse> SearchMedicamentosApi(@PathVariable Long id){
        MedicamentosResponse medicamentosResponse = medicamentosService.consultarMedicamentos(id);
        return ResponseEntity.accepted().body(medicamentosResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveMedicamentosApi(@RequestBody MedicamentosRequest medicamentosRequest){
        medicamentosService.guardarMedicamentos(medicamentosRequest);
        return ResponseEntity.accepted().body("Medicamento Guardado");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateMedicamentosApi(@RequestBody MedicamentosRequest medicamentosRequest ){
        medicamentosService.actualizarMedicamentos(medicamentosRequest);
        return ResponseEntity.accepted().body("Laboratorio Actualizado");

    }
}
