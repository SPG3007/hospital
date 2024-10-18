package com.hospital.services.service;

import com.hospital.controller.request.DoctoresRequest;
import com.hospital.controller.response.DoctoresResponse;
import com.hospital.entitys.Doctores;

import java.util.List;

public interface DoctoresService {
    List<Doctores> listarDoctores();
    void guardarDoctores(DoctoresRequest doctoresRequest);
    void eliminarDoctores(Long id);
    void actualizarDoctores(DoctoresRequest doctoresRequest);
    DoctoresResponse consultarDoctores(Long id);
}
