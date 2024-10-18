package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Table(name = "tipo_documento")
@Data
public class TipoDocumento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_documento")
    private int id;
    @Column (name = "siglas")
    private String sigla;
    @Column (name = "descripcion")
    private String descripcion;

}


