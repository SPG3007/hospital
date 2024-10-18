package com.hospital.services.service;

import com.hospital.controller.request.LaboratoriosRequest;
import com.hospital.controller.response.LaboratoriosResponse;
import com.hospital.entitys.Laboratorios;

import java.util.List;

public interface LaboratoriosService {
    List<Laboratorios> listarLaboratorios();
    void guardarLaboratorios(LaboratoriosRequest laboratoriosRequest);
    void eliminarLaboratorios(Long id);
    void actualizarLaboratorios(LaboratoriosRequest laboratoriosRequest);
    LaboratoriosResponse consultarLaboratorios(Long id);
}
