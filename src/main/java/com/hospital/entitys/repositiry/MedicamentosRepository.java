package com.hospital.entitys.repositiry;

import com.hospital.entitys.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicamentosRepository extends JpaRepository<Medicamentos,Long> {
    @Query(value = "SELECT * FROM medicamentos", nativeQuery = true)
    List<Medicamentos> listMedicamentos();

    @Query(value = "SELECT * FROM medicamentos WHERE id=:id",nativeQuery = true)
    Medicamentos searchCitas(@Param("id") Long id);
}
