package com.hospital.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonaResponse {
    private Long id;
    private String nombre;
    private String apellido;
    private  TipoDocumentoResponse tipoDocumentoResponse;
}
