package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_personas")
    private Long id;

    @Column (name = "nombres_personas")
    private String Nombre;

    @Column (name = "apellidos_personas")
    private String Apellido;

    @ManyToOne
    @JoinColumn(name = "fk_id_tipo_documento", referencedColumnName = "id_documento")
    private TipoDocumento fk_tipo_documento;



}


