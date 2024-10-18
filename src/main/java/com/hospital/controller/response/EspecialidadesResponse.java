package com.hospital.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EspecialidadesResponse {
    private Long id_especialidades;
    private String descripcion_especialidades;
}
