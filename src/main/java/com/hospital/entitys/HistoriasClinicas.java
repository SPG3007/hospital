package com.hospital.entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "historias_clinicas")
@Data
public class HistoriasClinicas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_historia")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_personas", referencedColumnName = "id_personas")
    private Personas fk_id_personas;

    @Column (name = "fecha_creacion")
    private LocalDate fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "fk_id_diagnostico", referencedColumnName = "id_diagnostico")
    private Diagnosticos fk_id_diagnostico;

}
