package com.hospital.entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "diagnosticos")
@Data
public class Diagnosticos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_diagnostico")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_historia", referencedColumnName = "id_historia")
    private HistoriasClinicas fk_id_historia;

    @ManyToOne
    @JoinColumn(name = "fk_id_doctor", referencedColumnName = "id_doctor")
    private Doctores fk_id_doctor;

    @Column (name = "descripcion_diagnosticos")
    private String descripcion;

    @Column (name = "fecha_diagnostico")
    private LocalDate fecha;
}
