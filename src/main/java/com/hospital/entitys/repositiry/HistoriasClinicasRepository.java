package com.hospital.entitys.repositiry;

import com.hospital.entitys.HistoriasClinicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoriasClinicasRepository extends JpaRepository<HistoriasClinicas,Long> {

    @Query(value = "SELECT * FROM historias_clinicas", nativeQuery = true)
    List<HistoriasClinicas> listHistoriasClinicas();

    @Query(value = "SELECT * FROM historias_clinicas WHERE id=:id",nativeQuery = true)
    HistoriasClinicas searchCitas(@Param("id") Long id);
}
