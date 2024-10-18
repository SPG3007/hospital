package com.hospital.entitys.repositiry;

import com.hospital.entitys.FormulasMedicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FormulasMedicasRepository extends JpaRepository<FormulasMedicas,Long> {
    @Query(value = "SELECT * FROM formulas_medicas", nativeQuery = true)
    List<FormulasMedicas> listFormulasMedicas();

    @Query(value = "SELECT * FROM formulas_medicas WHERE id=:id",nativeQuery = true)
    FormulasMedicas searchCitas(@Param("id") Long id);
}
