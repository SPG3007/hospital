package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EnfermerasRequest {
    private Long id_enfermera;
    private String nombres_enfermera;
    private String apellidos_enfermera;
    private String telefono;
    private String email;
}
