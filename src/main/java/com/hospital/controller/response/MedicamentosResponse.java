package com.hospital.controller.response;

import com.hospital.entitys.Laboratorios;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class MedicamentosResponse {
    private Long id_medicamento;
    private String nombre_medicamento;
    private Laboratorios laboratorios;
    private Long precio;
    private LocalDate fecha_vencimiento;
    private LocalDate fecha_fabricacion;
}
