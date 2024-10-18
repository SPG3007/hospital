package com.hospital.services.service;

import com.hospital.controller.request.MedicamentosRequest;
import com.hospital.controller.response.MedicamentosResponse;
import com.hospital.entitys.Medicamentos;

import java.util.List;

public interface MedicamentosService {
    List<Medicamentos> listarMedicamentos();
    void guardarMedicamentos(MedicamentosRequest medicamentosRequest);
    void eliminarMedicamentos(Long id);
    void actualizarMedicamentos(MedicamentosRequest medicamentosRequest);
    MedicamentosResponse consultarMedicamentos(Long id);
}
