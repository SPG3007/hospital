package com.hospital.entitys.repositiry;

import com.hospital.entitys.Diagnosticos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiagnosticosRepository extends JpaRepository <Diagnosticos,Long> {

    @Query(value = "SELECT * FROM diagnosticos", nativeQuery = true)
    List<Diagnosticos> listDiagnosticos();

    @Query(value = "SELECT * FROM diagnosticos WHERE id=:id",nativeQuery = true)
    Diagnosticos searchCitas(@Param("id") Long id);
}
