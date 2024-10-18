package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TipoDocumentoRequest {
    private String siglas;
    private String descripcion;
}
