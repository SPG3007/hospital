package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Data
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_cita")
    private Long id;

    @Column (name = "fecha_hora")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "fk_id_personas", referencedColumnName = "id_personas")
    private Personas fk_id_personas;

    @ManyToOne
    @JoinColumn(name = "fk_id_doctor", referencedColumnName = "id_doctor")
    private Doctores fk_id_doctor;

    @ManyToOne
    @JoinColumn(name = "fk_id_enfermera", referencedColumnName = "id_enfermera")
    private Enfermeras fk_id_enfermera;



}
