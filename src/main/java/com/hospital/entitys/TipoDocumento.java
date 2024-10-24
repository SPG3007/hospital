package com.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Table(name = "tipo_documento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TipoDocumento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_documento")
    private Long id;
    @Column (name = "siglas")
    private String sigla;
    @Column (name = "descripcion")
    private String descripcion;

}


