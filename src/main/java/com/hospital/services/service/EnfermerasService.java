package com.hospital.services.service;

import com.hospital.controller.request.EnfermerasRequest;
import com.hospital.controller.response.EnfermerasResponse;
import com.hospital.entitys.Enfermeras;

import java.util.List;

public interface EnfermerasService {
    List<Enfermeras> listarEnfermeras();
    void guardarEnfermeras(EnfermerasRequest enfermerasRequest);
    void eliminarEnfermeras(Long id);
    void actualizarEnfermeras(EnfermerasRequest enfermerasRequest);
    EnfermerasResponse consultarEnfermeras(Long id);
}
