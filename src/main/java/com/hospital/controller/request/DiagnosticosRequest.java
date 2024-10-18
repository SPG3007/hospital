package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Builder
@Data
public class DiagnosticosRequest {
    private Long id_diagnostico;
    private Long fk_id_historia;
    private Long fk_id_doctor;
    private String descripcion_diagnosticos;
    private LocalDate fecha_diagnostico;

}
