package com.hospital.services.service;

import com.hospital.controller.request.EspecialidadesRequest;
import com.hospital.controller.response.EspecialidadesResponse;
import com.hospital.entitys.Especialidades;

import java.util.List;

public interface EspecialidadesService {
    List<Especialidades> listarEspecialidades();
    void guardarEspecialidades(EspecialidadesRequest especialidadesRequest);
    void eliminarEspecialidades(Long id);
    void actualizarEspecialidades(EspecialidadesRequest especialidadesRequest);
    EspecialidadesResponse consultarEspecialidades(Long id);
}
