package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "enfermeras")
@Data
public class Enfermeras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enfermera")
    private Long id;

    @Column (name = "nombres_enfermera")
    private String Nombre;

    @Column (name = "apellidos_enfermera")
    private String Apellido;

    @Column (name = "telefono")
    private String Telefono;

    @Column (name = "email")
    private String Email;
}
