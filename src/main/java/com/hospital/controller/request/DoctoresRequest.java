package com.hospital.controller.request;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class DoctoresRequest {
    private Long id_doctor;
    private String nombres_doctor;
    private String apellidos_doctor;
    private Long fk_id_especialidad;
    private String telefono;
    private String email;

}
