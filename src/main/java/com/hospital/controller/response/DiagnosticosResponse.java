package com.hospital.controller.response;

import com.hospital.entitys.Doctores;
import com.hospital.entitys.HistoriasClinicas;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class DiagnosticosResponse {
    private Long id_diagnostico;
    private HistoriasClinicas historiasClinicas;
    private Doctores doctores;
    private String descripcion_diagnosticos;
    private LocalDate fecha_diagnostico;
}
