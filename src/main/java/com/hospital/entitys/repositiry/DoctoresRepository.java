package com.hospital.entitys.repositiry;

import com.hospital.entitys.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctoresRepository extends JpaRepository<Doctores,Long> {

    @Query(value = "SELECT * FROM doctores", nativeQuery = true)
    List<Doctores> listDoctores();

    @Query(value = "SELECT * FROM doctores WHERE id=:id",nativeQuery = true)
    Doctores searchCitas(@Param("id") Long id);
}
