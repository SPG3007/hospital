package com.hospital.entitys.repositiry;

import com.hospital.entitys.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Personas,Long> {

    @Query(value = "SELECT * FROM personas  ", nativeQuery = true)
    List<Personas>listPersonas();

    @Override
    List<Personas> findAll();
}
