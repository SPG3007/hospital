package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class MedicamentosRequest {
    private Long id_medicamento;
    private String nombre_medicamento;
    private Long fk_id_laboratorio;
    private Long precio;
    private LocalDate fecha_vencimiento;
    private LocalDate fecha_fabricacion;
}
