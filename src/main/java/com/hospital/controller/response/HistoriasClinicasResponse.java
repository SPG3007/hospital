package com.hospital.controller.response;

import com.hospital.entitys.Diagnosticos;
import com.hospital.entitys.Personas;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class HistoriasClinicasResponse {
    private Long id_historia;
    private Personas personas;
    private LocalDate fecha_creacion;
    private Diagnosticos diagnosticos;
}
