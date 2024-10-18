package com.hospital.entitys.repositiry;

import com.hospital.entitys.Especialidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EspecialidadesRepository extends JpaRepository<Especialidades,Long> {
    @Query(value = "SELECT * FROM especialidades", nativeQuery = true)
    List<Especialidades> listEspecialidades();

    @Query(value = "SELECT * FROM especialidades WHERE id=:id",nativeQuery = true)
    Especialidades searchCitas(@Param("id") Long id);
}
