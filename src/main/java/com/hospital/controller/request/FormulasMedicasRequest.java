package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class FormulasMedicasRequest {
    private Long id_formula;
    private Long fk_id_historia_clinica;
    private Long fk_id_doctor;
    private Long fk_id_medicamento;
    private String descripcion_medicamento;
    private LocalDate fecha_formulacion;
}
