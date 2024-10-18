package com.hospital.services.service;

import com.hospital.controller.request.DiagnosticosRequest;
import com.hospital.controller.response.DiagnosticosResponse;
import com.hospital.entitys.Diagnosticos;

import java.util.List;

public interface DiagnosticosService {
    List<Diagnosticos> listarDiagnosticos();
    void guardarDiagnosticos(DiagnosticosRequest diagnosticosRequest);
    void eliminarDiagnosticos(Long id);
    void actualizarDiagnosticos(DiagnosticosRequest diagnosticosRequest);
    DiagnosticosResponse consultarDiagnosticos(Long id);
}
