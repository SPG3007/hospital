package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class CitasRequest {
    private Long id_cita;
    private Long fk_id_personas;
    private Long fk_id_doctor;
    private LocalDateTime fecha_hora;
    private Long fk_id_enfermera;
}
