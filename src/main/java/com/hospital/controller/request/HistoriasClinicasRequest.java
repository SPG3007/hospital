package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class HistoriasClinicasRequest {
    private Long id_historia;
    private Long fk_id_personas;
    private LocalDate fecha_creacion;
    private Long fk_id_diagnostico;


}
