package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table (name = "formulas_medicas")
@Data
public class FormulasMedicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formula")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_historia_clinica", referencedColumnName = "id_historia")
    private HistoriasClinicas fk_id_historia_clinica;

    @ManyToOne
    @JoinColumn(name = "fk_id_doctor", referencedColumnName = "id_doctor")
    private Doctores fk_id_doctor;

    @ManyToOne
    @JoinColumn(name = "fk_id_medicamento", referencedColumnName = "id_medicamento")
    private Medicamentos fk_id_medicamento;

    @Column (name = "descripcion_medicamento")
    private String descripcion;

    @Column (name = "fecha_formulacion")
    private LocalDate fecha_formulacion;
}
