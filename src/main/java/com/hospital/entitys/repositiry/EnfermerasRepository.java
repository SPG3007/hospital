package com.hospital.entitys.repositiry;


import com.hospital.entitys.Enfermeras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnfermerasRepository extends JpaRepository<Enfermeras,Long> {
    @Query(value = "SELECT * FROM enfermeras", nativeQuery = true)
    List<Enfermeras> listEnfermeras();

    @Query(value = "SELECT * FROM enfermeras WHERE id=:id",nativeQuery = true)
    Enfermeras searchCitas(@Param("id") Long id);
}
