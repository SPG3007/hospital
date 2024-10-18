package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doctores")
@Data
public class Doctores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_doctor")
    private Long id;

    @Column (name = "nombres_doctor")
    private String nombre;

    @Column (name = "apellidos_doctor")
    private String Apellido;

    @ManyToOne
    @JoinColumn(name = "fk_id_especialidad", referencedColumnName = "id_especialidades")
    private Especialidades fk_id_especialidad;

    @Column (name = "telefono")
    private String Telefono;

    @Column (name = "email")
    private String Email;



}
