package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "personas")
@Data
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "Apellido")
    private String Apellido;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_documento", referencedColumnName = "id")
    private TipoDocumento fk_tipo_documento;



}


