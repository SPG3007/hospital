package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class LaboratoriosRequest {
    private Long id_laboratorio;
    private String descripcion_laboratorios;
}
