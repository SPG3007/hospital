package com.hospital.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TipoDocumentoResponse {
    private Long id;
    private String siglas;
    private String descripcion;
}
