package com.hospital.controller.response;

import com.hospital.entitys.Especialidades;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DoctoresResponse {
    private Long id_doctor;
    private String nombres_doctor;
    private String apellidos_doctor;
    private Especialidades especialidades;
    private String telefono;
    private String email;
}
