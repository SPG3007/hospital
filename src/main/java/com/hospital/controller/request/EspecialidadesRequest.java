package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EspecialidadesRequest {
    private Long id_especialidades;
    private String descripcion_especialidades;
}
