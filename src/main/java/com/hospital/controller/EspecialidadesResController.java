package com.hospital.controller;

import com.hospital.controller.request.EnfermerasRequest;
import com.hospital.controller.request.EspecialidadesRequest;
import com.hospital.controller.response.EnfermerasResponse;
import com.hospital.controller.response.EspecialidadesResponse;
import com.hospital.entitys.Enfermeras;
import com.hospital.entitys.Especialidades;
import com.hospital.services.service.EnfermerasService;
import com.hospital.services.service.EspecialidadesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/especialidades")
@RequiredArgsConstructor
public class EspecialidadesResController {
    private  final EspecialidadesService especialidadesService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<Especialidades>> listEspecialidadesApi(){
        List<Especialidades> especialidadesList = especialidadesService.listarEspecialidades();
        return new ResponseEntity<>(especialidadesList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedEspecialidadesApi(@RequestParam(name = "id")Long id){
        especialidadesService.eliminarEspecialidades(id);
        return ResponseEntity.accepted().body("Especialidad eliminada");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<EspecialidadesResponse> SearchEspecialidadesApi(@PathVariable Long id){
        EspecialidadesResponse especialidadesResponse = especialidadesService.consultarEspecialidades(id);
        return ResponseEntity.accepted().body(especialidadesResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SaveEspecialidadesApi(@RequestBody EspecialidadesRequest especialidadesRequest){
        especialidadesService.guardarEspecialidades(especialidadesRequest);
        return ResponseEntity.accepted().body("Especialidad Guardada");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdateEspecialidadesApi(@RequestBody EspecialidadesRequest especialidadesRequest ){
        especialidadesService.actualizarEspecialidades(especialidadesRequest);
        return ResponseEntity.accepted().body("Especialidad Actualizada");

    }
}
