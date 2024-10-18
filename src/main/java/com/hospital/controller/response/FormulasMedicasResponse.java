package com.hospital.controller.response;

import com.hospital.entitys.Doctores;
import com.hospital.entitys.HistoriasClinicas;
import com.hospital.entitys.Medicamentos;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class FormulasMedicasResponse {
    private Long id_formula;
    private HistoriasClinicas historiasClinicas;
    private Doctores doctores;
    private Medicamentos medicamentos;
    private String descripcion_medicamento;
    private LocalDate fecha_formulacion;
}
