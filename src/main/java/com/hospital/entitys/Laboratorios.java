package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "laboratorios")
@Data
public class Laboratorios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_laboratorio")
    private Long id;

    @Column (name = "descripcion_laboratorios")
    private String descripcion;

}
