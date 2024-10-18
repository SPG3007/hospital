package com.hospital.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LaboratoriosResponse {
    private Long id_laboratorio;
    private String descripcion_laboratorios;
}
