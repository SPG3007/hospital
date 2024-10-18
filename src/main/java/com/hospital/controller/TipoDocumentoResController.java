package com.hospital.controller;

import com.hospital.controller.request.TipoDocumentoRequest;
import com.hospital.controller.response.TipoDocumentoResponse;
import com.hospital.entitys.Personas;
import com.hospital.entitys.TipoDocumento;
import com.hospital.services.service.PersonaService;
import com.hospital.services.service.TipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TipoDocumentos/v1")
@RequiredArgsConstructor
public class TipoDocumentoResController {

    private  final TipoDocumentoService tipoDocumentoService;

    @GetMapping(name = "/List")
    public ResponseEntity<List<TipoDocumento>> listTipoDocuemntoApi(){
        List<TipoDocumento> tipoDocumentosList = tipoDocumentoService.listarTipoDocumentos();
        return ResponseEntity.accepted().body(tipoDocumentosList);

    }

    @GetMapping(name = "/Deleted")
    public ResponseEntity<String> DeletedPersonasApi(@RequestParam("id")Long id){
        tipoDocumentoService.eliminarTipoDocumentos(id);
        return ResponseEntity.accepted().body("Tipo de documento eliminado");

    }
    @GetMapping(name = "/Search")
    public ResponseEntity<TipoDocumentoResponse> SearchPersonasApi(@PathVariable Long id){
        TipoDocumentoResponse tipoDocumentoResponse= tipoDocumentoService.consultarTipoDocumentos(id);
        return ResponseEntity.accepted().body(tipoDocumentoResponse);

    }

    @GetMapping(name = "/Save")
    public ResponseEntity<String> SavePersonasApi(@RequestBody TipoDocumentoRequest tipoDocumentoRequest){
        tipoDocumentoService.guardarTipoDocumentos(tipoDocumentoRequest);
        return ResponseEntity.accepted().body("Tipo de documento guardado");

    }

    @GetMapping(name = "/Update")
    public ResponseEntity<String> UpdatePersonasApi(@RequestBody TipoDocumentoRequest tipoDocumentoRequest){
        tipoDocumentoService.actualizarTipoDocumentos(tipoDocumentoRequest);
        return ResponseEntity.accepted().body("Tipo de documento actualizado");

    }
}
