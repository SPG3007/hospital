package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name =  "especialidades")
@Data
public class Especialidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidades")
    private Long id;

    @Column (name = "descripcion_especialidades")
    private String descripcion;
}
