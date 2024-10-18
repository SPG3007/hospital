package com.hospital.services.service;

import com.hospital.controller.request.CitasRequest;
import com.hospital.controller.response.CitasResponse;
import com.hospital.entitys.Citas;

import java.util.List;

public interface CitasService {
    List<Citas> listarCitas();
    void guardarCitas(CitasRequest citasRequest);
    void eliminarCitas(Long id);
    void actualizarCitas(CitasRequest citasRequest);
    CitasResponse consultarCitas(Long id);
}
