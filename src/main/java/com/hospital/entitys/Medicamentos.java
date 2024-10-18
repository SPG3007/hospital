package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "medicamentos")
@Data
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_laboratorio", referencedColumnName = "id_laboratorio")
    private Laboratorios fk_id_laboratorio;

    @Column (name = "nombre_medicamento")
    private String Nombre;

    @Column (name = "precio")
    private Double Precio;

    @Column (name = "fecha_vencimiento")
    private LocalDate fecha_vencimiento;

    @Column (name = "fecha_fabricacion")
    private LocalDate fecha_fabricacion;
}
