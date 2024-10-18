package com.hospital.services.service;

import com.hospital.controller.request.HistoriasClinicasRequest;
import com.hospital.controller.response.HistoriasClinicasResponse;
import com.hospital.entitys.HistoriasClinicas;

import java.util.List;

public interface HistoriasClinicasService {
    List<HistoriasClinicas> listarHistoriasClinicas();
    void guardarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest);
    void eliminarHistoriasClinicas(Long id);
    void actualizarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest);
    HistoriasClinicasResponse consultarHistoriasClinicas(Long id);
}
