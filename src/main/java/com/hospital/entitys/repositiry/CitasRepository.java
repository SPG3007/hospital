package com.hospital.entitys.repositiry;

import com.hospital.entitys.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CitasRepository extends JpaRepository <Citas,Long> {

    @Query(value = "SELECT * FROM citas  ", nativeQuery = true)
    List<Citas> listCitas();

    @Query(value = "SELECT * FROM citas WHERE id=:id",nativeQuery = true)
    Citas searchCitas(@Param("id") Long id);
}
