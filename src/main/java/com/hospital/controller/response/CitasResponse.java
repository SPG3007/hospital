package com.hospital.controller.response;

import com.hospital.entitys.Doctores;
import com.hospital.entitys.Enfermeras;
import com.hospital.entitys.Personas;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class CitasResponse {
    private Long id_cita;
    private Personas personas;
    private Doctores doctores;
    private LocalDateTime fecha_hora;
    private Enfermeras enfermeras;
}
