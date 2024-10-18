package com.hospital.entitys.repositiry;

import com.hospital.entitys.Laboratorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LaboratoriosRepository extends JpaRepository<Laboratorios,Long> {
    @Query(value = "SELECT * FROM laboratorios", nativeQuery = true)
    List<Laboratorios> listLaboratorios();

    @Query(value = "SELECT * FROM laboratorios WHERE id=:id",nativeQuery = true)
    Laboratorios searchCitas(@Param("id") Long id);
}
